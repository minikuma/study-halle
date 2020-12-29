package me.minikuma.week6;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wminikuma@gmail.com on 2020/12/23
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class DoubleDispatch {

    interface Post {
        void postOn(SNS sns);
    }

    static class Text implements Post {
        @Override
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    static class Picture implements Post {
        @Override
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    interface SNS {
        void post(Text post);
        void post(Picture post);
    }

    static class Facebook implements SNS {
        @Override
        public void post(Text post) {
            System.out.println("text -> facebook");
        }
        @Override
        public void post(Picture post) {
            System.out.println("picture -> facebook");
        }
    }

    static class Instagram implements SNS {
        @Override
        public void post(Text post) {
            System.out.println("text -> instagram");
        }

        @Override
        public void post(Picture post) {
            System.out.println("picture -> instagram");
        }
    }

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Instagram());
        posts.forEach(p -> sns.forEach(p::postOn));
    }
}
