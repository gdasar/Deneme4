import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "anasayfaView")
public class Anasayfa {

    private boolean ekranAnasayfa = true;
    private boolean ekranHakkimizda = false;
    private boolean ekranGaleri = false;
    private boolean ekranOdalarimiz = false;

    private List<String> images;

    @PostConstruct
    public void init(){

        images = new ArrayList<String>();
        System.out.println("Basliyor");
        for(int i = 1 ; i < 10 ; i++){
            System.out.println("hotel" + i + ".jpg");
            images.add("hotel" + i + ".jpg");
        }

    }






    public String yonlendirme(Integer ekranNumarasi) {

        System.out.println("ekran yonlendirmesi");

        switch(ekranNumarasi){
            case 1 : ekranAnasayfa = true;
                ekranHakkimizda = false;
                ekranGaleri= false;
                ekranOdalarimiz = false;
                break;

            case 2 : ekranAnasayfa = false;
                ekranHakkimizda = true;
                ekranGaleri= false;
                ekranOdalarimiz = false;
                break;

            case 3 : ekranAnasayfa = false;
                ekranHakkimizda = false;
                ekranGaleri= true;
                ekranOdalarimiz = false;
                break;
            case 4 : ekranAnasayfa = false;
                ekranHakkimizda = false;
                ekranGaleri= false;
                ekranOdalarimiz = true;
                break;

        }

        return "";
    }

    public boolean isEkranAnasayfa() {
        return ekranAnasayfa;
    }

    public void setEkranAnasayfa(boolean ekranAnasayfa) {
        this.ekranAnasayfa = ekranAnasayfa;
    }

    public boolean isEkranHakkimizda() {
        return ekranHakkimizda;
    }

    public void setEkranHakkimizda(boolean ekranHakkimizda) {
        this.ekranHakkimizda = ekranHakkimizda;
    }

    public boolean isEkranGaleri() {
        return ekranGaleri;
    }

    public void setEkranGaleri(boolean ekranGaleri) {
        this.ekranGaleri = ekranGaleri;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public boolean isEkranOdalarimiz() {
        return ekranOdalarimiz;
    }

    public void setEkranOdalarimiz(boolean ekranOdalarimiz) {
        this.ekranOdalarimiz = ekranOdalarimiz;
    }

}
