package composingmobileapps.com.purnendusample;

/**
 * Created by anildeshpande on 9/20/17.
 */

public class Person {
    private String imageUrl;
    private String text1,text2,text3;

    public Person(){
        super();
    }

    public Person(String imageUrl,String text1,String text2,String text3){
        this.imageUrl = imageUrl;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }
}
