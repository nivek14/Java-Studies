package Padroes.obsever;

import java.util.Date;

public class EventAniversariante {

    private final Date momento;

    public EventAniversariante(Date momento){
        this.momento = momento;
    }

    public Date getMomento(){
        return momento;
    }

}
