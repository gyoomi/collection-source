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
            // 1.地址值相等，一定相同
            if (this == obj) {
                return true;
            }
            // 2.为null，一定不相等
            if (obj == null) {
                return false;
            }
            // 3.检测是否是一个类，如果不是一个类直接返回false
            if (getClass() != obj.getClass()) {
                return false;
            }
            // 4.如果不是Person类型，一定不相同
            if ( !(obj instanceof Person)) {
                return false;
            }
            // 5.将obj转为对应的类型
            Person p = (Person) obj;
            // 6.对对象的属性进行比较，== 基本类型 equals是对象类型
            if (p.getId().equals(this.id) && p.getName().equals(this.name)) {
                return true;
            }
            // 6-2.如果是在子类，子类的equals方法要包含父类的equals方法。如在子类Student中
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
            // 1.地址值相等，一定相同
            if (this == obj) {
                return true;
            }
            // 2.为null，一定不相等
            if (obj == null) {
                return false;
            }
            // 3.检测是否是一个类，如果不是一个类直接返回false
            if (getClass() != obj.getClass()) {
                return false;
            }
            // 4.如果不是Person类型，一定不相同
            if ( !(obj instanceof Student)) {
                return false;
            }
            // 5.将obj转为对应的类型
            Student s = (Student) obj;
            // 6.对对象的属性进行比较，== 基本类型 equals是对象类型
            return super.equals(s) && this.classRoom.equals(s.getClassRoom());
            // 6-2.如果是在子类，子类的equals方法要包含父类的equals方法。如在子类Student中
        }

        public String getClassRoom() {
            return classRoom;
        }

        public void setClassRoom(String classRoom) {
            this.classRoom = classRoom;
        }
    }
}
