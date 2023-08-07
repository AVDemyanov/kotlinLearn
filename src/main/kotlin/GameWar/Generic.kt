package GameWar

import java.util.Stack

class Generic<T> {
    val stack = Stack<T>()

    fun push(item: T) {
        stack.add(item)
    }

    fun pop(): T? {
        return stack.removeFirst()
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }
}