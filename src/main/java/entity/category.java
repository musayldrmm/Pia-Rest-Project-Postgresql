package entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name="restoran_Category")
@Getter
@Setter
public class category {
    @Id
    @SequenceGenerator(name="seq_restoran_category",allocationSize = 1)
    @GeneratedValue(generator = "seq_restoran_category",strategy = GenerationType.SEQUENCE)
    @javax.persistence.Id
    @Column(name="Category_id")
    private Long id;
    @Column(length = 50,name="Category")
    private String Category ;
}
