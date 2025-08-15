package cys.gnanu.SumUp.data;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "fixed_invest_groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FixedInvestGroups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long id; // auto-generated

    @Column(name = "group_name", nullable = false, unique = true)
    private String groupName;

    @Column(columnDefinition = "TEXT")
    private String AliasList;
    @Column(name="roi")
    private String roi;
    @Column(name = "strt_date")
    private String strtDate;
    
    @Column(name = "end_date")
    private String endDate;
    
    @Column(name = "sum_amount")
    private String sumAmount;
    
}
