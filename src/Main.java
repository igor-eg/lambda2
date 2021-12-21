class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorCallback = System.out::println;
        Worker worker = new Worker(listener, errorCallback);
        worker.start();
    }
}

