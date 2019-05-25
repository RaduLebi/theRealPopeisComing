package ro.esolution.theRealPopeisComeing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConectorExtern {

    @GetMapping("/churches")
    public String getAllChurches() {
        //de facut biserica noua
        //in loc de return text chior   return "..... sunt + nume biserica;
        Biserica sfantulIosif = new Biserica();
        sfantulIosif.nume=" Sfantul Iosif";
        sfantulIosif.luna="mai";
        sfantulIosif.tipReligie="catolic";

        return " Bisericile mele sunt:" + sfantulIosif.nume;

    }
}
