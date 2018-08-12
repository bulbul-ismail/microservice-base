package com.springboot.springboottemplate.spec;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import com.springboot.springboottemplate.entity.Currency;
import com.springboot.springboottemplate.entity.Currency_;

public class CurrencySpecification {

	public static Specification<Currency> matchesCode(Optional<String> code) {

		return (root, query, builder) -> {

			List<Predicate> predicates = new ArrayList<>();

			if (code.isPresent() && !code.get().isEmpty()) {

				Predicate predicate = builder.and(builder.equal(root.<String>get(Currency_.code), code.get()));
				predicates.add(predicate);
			}

			Predicate[] predicatesArray = predicates.toArray(new Predicate[predicates.size()]);
			return builder.and(predicatesArray);

		};

	}
}
