package entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="restoran_adres")
@Getter
@Setter
public class adres implements Serializable {
    @Id
    @SequenceGenerator(name="seq_restoran_adres",allocationSize = 1)
    @GeneratedValue(generator = "seq_restoran_adres",strategy = GenerationType.SEQUENCE)
    @javax.persistence.Id
    @Column(name="Adres_id")
    private Long id;
    @Column(length = 30,name="şehir")
    private String Şehir ;
    @Column(length = 30,name="ilçe")
    private String ilçe;
    @Column(length = 30,name="mahalle")
    private String mahalle;

}
