package com.ji.algo.L2301_2350;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/06/下午10:09
 */
public class FoodRatings {
    Map<String, String> map = new HashMap<>();
    Map<String, TreeSet<Foo>> ratingMap = new HashMap<String, TreeSet<Foo>>();
    Map<String, Foo> fooMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rate = ratings[i];
            map.put(food, cuisine);
            TreeSet<Foo> tmp = ratingMap.getOrDefault(cuisine, new TreeSet<>(new Comparator<Foo>() {
                @Override
                public int compare(Foo o1, Foo o2) {
                    if (o1.rate == o2.rate && o1.name.equals(o2.name)) {
                        return 0;
                    }
                    if (o1.rate > o2.rate) {
                        return -1;
                    }
                    if (o1.rate == o2.rate) {
                        if (o1.name.compareTo(o2.name) < 0) {
                            return -1;
                        }
                    }
                    return 1;
                }
            }));
            Foo foo = new Foo(rate, food);
            fooMap.put(food, foo);
            tmp.add(foo);
            ratingMap.put(cuisine, tmp);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = map.get(food);
        TreeSet<Foo> tmp = ratingMap.getOrDefault(cuisine, new TreeSet<>());
        Foo foo = fooMap.get(food);
        System.out.println(tmp.remove(foo));
        foo.rate = newRating;
        fooMap.put(food, foo);
        tmp.add(foo);
    }

    public String highestRated(String cuisine) {
        TreeSet<Foo> tmp = ratingMap.get(cuisine);
        return tmp.first().name;
    }

    static class Foo {
        int rate;
        String name;

        public Foo(int rate, String name) {
            this.rate = rate;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Foo foo = (Foo) o;
            return rate == foo.rate && Objects.equals(name, foo.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(rate, name);
        }
    }

    public static void main(String[] args) {
        String[] foot = {"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
        String[] cuisines = {"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        int[] rate = {9, 12, 8, 15, 14, 7};
        FoodRatings foodRatings = new FoodRatings(foot, cuisines, rate);
        foodRatings.changeRating("sushi", 16);
        foodRatings.changeRating("ramen", 16);
//        System.out.println(foodRatings.highestRated("korean"));
//        Foo foo1 = new Foo(1, "suishi");
//        Foo foo2 = new Foo(0, "ramen");
//        TreeSet<Foo> foos = new TreeSet<Foo>(new Comparator<Foo>() {
//            @Override
//            public int compare(Foo o1, Foo o2) {
//                if (o1.rate > o2.rate) {
//                    return -1;
//                }
//                if (o1.rate == o2.rate) {
//                    if (o1.name.compareTo(o2.name) < 0) {
//                        return -1;
//                    }
//                }
//                return 1;
//            }
//        });
//        foos.add(foo1);
//        foos.add(foo2);
//        System.out.println();
//        foos.remove(foo2);
//        foo2.rate = 1;
//        foos.add(foo2);
//
//
//        System.out.println(foos.first().name);
        System.out.println(foodRatings.highestRated("japanese"));
    }
}
