import javafx.beans.NamedArg;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import java.io.IOException;

@ManagedBean(name = "menu")
public class Menu {

    Integer ekranNumarasi = 0;
    String ekranAdi = "";

    public String getEkranAdi() {
        return ekranAdi;
    }

    public void setEkranAdi(String ekranAdi) {
        this.ekranAdi = ekranAdi;
    }

    public Integer getEkranNumarasi() {
        return ekranNumarasi;
    }

    public void setEkranNumarasi(Integer ekranNumarasi) {
        this.ekranNumarasi = ekranNumarasi;
    }

    public String yonlendirme(Integer ekranNumarasi) throws IOException {

        System.out.println("ekran yonlendirmesi");

        switch(ekranNumarasi){
            case 1 : ekranAdi = "anasayfa";
                break;

            case 2 : ekranAdi = "hakkimizda";
                break;

            case 3 : ekranAdi = "galeri";
                break;

        }


        FacesContext.getCurrentInstance().getExternalContext().dispatch(ekranAdi + ".xhtml");

        return "";
    }


}
