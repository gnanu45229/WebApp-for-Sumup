package cys.gnanu.SumUp.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FixedInvestGroups getFixedInvestGroup() {
		return fixedInvestGroup;
	}

	public void setFixedInvestGroup(FixedInvestGroups fixedInvestGroup) {
		this.fixedInvestGroup = fixedInvestGroup;
	}

	@ManyToOne
    @JoinColumn(name = "group_id")
    private FixedInvestGroups fixedInvestGroup;
}