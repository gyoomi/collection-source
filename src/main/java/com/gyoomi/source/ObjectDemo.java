/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.source;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/10/30 15:27
 */
public class ObjectDemo {

    public static void main(String[] args) {
        Person p1 = new Person("1001", "tom");
        Student s = new Student("1001", "tom", "909");
        System.out.println(p1.equals(s)); // true
        System.out.println(s.equals(p1)); // false
    }

    static class Person {
        private String id;
        private String name;
        public Person() {}
        public Person(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            // 地址值相等，一定相同
            if (this == obj) {
                return true;
            }
            // 为null或不是Person类型，一定不相同
            if (obj == null || !(obj instanceof Person)) {
                return false;
            }
            Person p = (Person) obj;
            // 只有当id和名字都相等，这两个对象才算相同
            if (p.getId().equals(this.id) && p.getName().equals(this.name)) {
                return true;
            }
            return false;
        }
    }

    static class Student extends Person {
        private String classRoom;

        public Student() {}

        public Student(String id, String name, String classRoom) {
            super(id, name);
            this.classRoom = classRoom;
        }

        @Override
        public boolean equals(Object obj) {
            // 地址值相等，一定相同
            if (this == obj) {
                return true;
            }
            // 为null或不是Person类型，一定不相同
            if (obj == null || !(obj instanceof Student)) {
                return false;
            }
            Student s = (Student) obj;
            // 只有当id和名字及classRoom都相等，这两个对象才算相同
            if (super.getId().equals(s.getId()) && super.getName().equals(s.getName()) && this.classRoom.equals(s.getClassRoom())) {
                return true;
            }
            return false;
        }

        public String getClassRoom() {
            return classRoom;
        }

        public void setClassRoom(String classRoom) {
            this.classRoom = classRoom;
        }
    }
}
