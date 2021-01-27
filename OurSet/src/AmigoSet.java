package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * Created by Denis on 06.12.2019.
 * Стандартные буквы, которые используют для дженериков - это E (element), T (type), K (key), V (value).
 */
public class AmigoSet<E> extends OurSet<E> implements Serializable , Cloneable, Set<E>
{
    private static final Object PRESENT = new Object();
    private transient HashMap<E,Object> map;

    public AmigoSet()
    {
        map = new HashMap<>();
    }

    @Override
    public Object clone() throws InternalError//CloneNotSupportedException
    {

        AmigoSet amigoSet;
        try {
            amigoSet = (AmigoSet) super.clone();
            amigoSet.map = (HashMap) map.clone();
        } catch (Exception e) {
            throw new InternalError();
        }
        return amigoSet;
    }

    @Override
    public boolean add(E e)
    {
        //return super.add(e);
        //return map.put(e, PRESENT) == null;

        return null==map.put( e,PRESENT);

    }

    public AmigoSet(Collection<? extends E> collection)
    {

        //Вычисли свою Capacity по такой формуле: максимальное из 16 и округленного в большую сторону значения (collection.size()/.75f)
        int capacity = Math.max(16, (int)(collection.size()/.75f)+1);
        //Добавь все элементы из collection в нашу коллекцию.
        this.map = new HashMap<>(capacity);
        for (E e: collection){
            map.put(e, PRESENT);
        }

     /*   map = new HashMap<>((int)Math.max(16,collection.size()/.75f));
        this.addAll(collection);*/


    }

    @Override
    public Iterator<E> iterator()
    {
        return   map.keySet().iterator();
    }

    @Override
    public boolean remove(Object o)
    {
        return map.keySet().remove(o);
    }

    @Override
    public void clear()
    {
        map.clear();
    }

    @Override
    public boolean contains(Object o)
    {
        return map.keySet().contains(o);
    }

    @Override
    public boolean isEmpty()
    {
        return map.isEmpty();
    }

    @Override
    public int size()
    {
        return map.size();
    }

    private void writeObject(ObjectOutputStream out) throws IOException
    {

        /*пишем capacity, loadFactor и размер map. Первые два достаем через рефлексию, они по другому не доступны.
        Далее в цикле пишем keySet мапы.
        Пишем keySet а не Entry, т.к. сериализовать values нет смысла, они же одинаковые.*/
        out.defaultWriteObject();

        out.writeObject(map.size());
        for(E e:map.keySet()){
            out.writeObject(e);
        }
        out.writeObject(HashMapReflectionHelper.callHiddenMethod(map,"capacity"));
        out.writeObject(HashMapReflectionHelper.callHiddenMethod(map,"loadFactor"));


    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
/*        Теперь у нас есть все, чтобы восстановить map.
        Создаем новый объект с capacity и loadFactor в конструкторе.
            В цикле читаем и добавляем в новый map восстановленные объекты E.
        В качестве value используем PRESENT.*/

        in.defaultReadObject();
        int size = (int)in.readObject();

        Set<E> set = new HashSet<>();
        for(int i =0;i<size;i++){
            set.add((E)in.readObject());
        }
        int capacity = (int)in.readObject();
        float loadFactor = (float)in.readObject();
        map = new HashMap<>(capacity,loadFactor);
        for(E e:set){
            map.put(e,PRESENT);
        }

    }
}
