/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: EGS
 * Filename: Node.java
 * Date: 11/10/2020, 11:41
 */

package classeg.chapter5.discuss;

public class Node {
    // 需要保存的数据
    private int data;
    // 要保存的下一个节点
    private Node next;

    // 获取当前节点数据
    public int getData() {
        return data;
    }

    // 设置或修改当前节点数据
    public void setData(int data) {
        this.data = data;
    }

    // 设置当前节点的下一节点关系
    public void setNext(Node next) {
        this.next = next;
    }

    // 取得当前节点的下一个节点
    public Node getNext() {
        return next;
    }

    // 带参数的构造方法
    public Node(int data) {
        this.data = data;
    }
}

class TestNode {
    public static void main(String[] args) {
        // 定义节点
        Node head = new Node(123);
        Node nod1 = new Node(234);
        Node nod2 = new Node(345);

        // 设置节点关系
        head.setNext(nod1);
        nod1.setNext(nod2);

        // 根据节点关系取得数据
        Node curNod = head; // 从根节点开始读取
        while (curNod != null){
            // 输出当前节点数据
            System.out.println(curNod.getData());
            // 将下一节点设置为当前节点
            curNod = curNod.getNext();
        }
    }
}