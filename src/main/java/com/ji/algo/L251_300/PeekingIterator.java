package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 9:18 PM
*/

public class PeekingIterator {
//    class PeekingIterator implements Iterator<Integer> {
//        Iterator<Integer> it;
//        Integer tmp = null;
//        public PeekingIterator(Iterator<Integer> iterator) {
//            // initialize any member here.
//            it = iterator;
//        }
//
//        // Returns the next element in the iteration without advancing the iterator.
//        public Integer peek() {
//            if(tmp==null){
//                tmp = it.next();
//            }
//            return tmp;
//        }
//
//        // hasNext() and next() should behave the same as in the Iterator interface.
//        // Override them if needed.
//        @Override
//        public Integer next() {
//            if(tmp!=null){
//                Integer t = tmp;
//                tmp = null;
//                return t;
//            }else{
//                return it.next();
//            }
//        }
//
//        @Override
//        public boolean hasNext() {
//            return tmp!=null||it.hasNext();
//        }
//    }
}
