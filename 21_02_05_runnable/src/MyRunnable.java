
class MyRunnable implements Runnable {
    Thread thread;

    // Конструктор
    MyRunnable() {
        // Создаём новый второй поток
        thread = new Thread(this, "Поток для примера");
        Log.i(TAG, "Создан второй поток " + thread);
        thread.start(); // Запускаем поток
    }

    // Обязательный метод для интерфейса Runnable
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                Log.i(TAG, "Второй поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Log.i(TAG, "Второй поток прерван");
        }
    }
}