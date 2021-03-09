package com.javacourse.se.lesson30;

public class PerimeterException extends Exception {
    public PerimeterException() { //Наш конструктор может быть пустой
    }

    public PerimeterException(String message) { //Либо Наш конструктор может принимать сообщение
        super(message);
    }

    public PerimeterException(String message, Throwable cause) { // Либо может принимать сообщение и причину
        super(message, cause);
    }

    public PerimeterException(Throwable cause) { //Либо может принимать просто причину
        super(cause);
    }

    public PerimeterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { // ХЗ
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
