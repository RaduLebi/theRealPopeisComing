package ro.esolution.theRealPopeisComeing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConectorExtern {

    @GetMapping("/churches/{month}")
    public String getAllChurches(@PathVariable String month) {
        //de facut biserica noua
        //in loc de return text chior   return "..... sunt + nume biserica;


        String raspuns = "Bisericile mele sunt: ";

        List<Biserica> biserici = new ArrayList<>();




        Biserica sfantulIosif = new Biserica();
        sfantulIosif.nume=" Sfantul Iosif";
        sfantulIosif.luna="mai";
        sfantulIosif.tipReligie="catolic";


        Biserica sfantulIon = new Biserica();
        sfantulIon.nume="Sfantul Ion";
        sfantulIon.luna="ianuarie";
        sfantulIon.tipReligie=" budist";


        Biserica sfantulIbrahim = new Biserica();
        sfantulIbrahim.nume="Sfantul Ibrahim";
        sfantulIbrahim.luna=" octombrie";
        sfantulIbrahim.tipReligie="ortodox";

        Biserica sfantulRadu = new Biserica();
        sfantulRadu.nume="Sfantul Radu";
        sfantulRadu.luna="februarie";
        sfantulRadu.tipReligie="catolic";

        Biserica sfantulMatei = new Biserica();
        sfantulMatei.nume=" sfantul Matei";
        sfantulMatei.luna=" martie";
        sfantulMatei.tipReligie= " hindu";

        biserici.add(sfantulIbrahim);
        biserici.add(sfantulIon);
        biserici.add(sfantulIosif);
        biserici.add(sfantulMatei);
        biserici.add(sfantulRadu);

        for(int i=0;i< biserici.size();i++) {
            if (biserici.get(i).luna.equals(month))
            {
                raspuns += biserici.get(i).nume + " ";

            }
        }






    }
}
