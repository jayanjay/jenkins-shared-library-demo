package org.example

class MyUtils implements Serializable {
    static String shout(String msg) {
        return msg.toUpperCase() + "!!!"
    }
}
