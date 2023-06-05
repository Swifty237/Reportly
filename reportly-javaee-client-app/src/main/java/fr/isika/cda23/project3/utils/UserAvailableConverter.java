package fr.isika.cda23.project3.utils;

import java.util.List;
import java.util.Optional;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import fr.isika.cda.entities.users.Employee;
import fr.isika.cda23.project3.presentation.managedBeans.TeamEmployeeBean;

@FacesConverter(value = "userAvailableConverter")
public class UserAvailableConverter implements Converter {
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			TeamEmployeeBean teamEmployeeBean = context.getApplication().evaluateExpressionGet(context,
					"#{teamEmployeeBean}", TeamEmployeeBean.class);
			List<Employee> usersAvailable = teamEmployeeBean.getAvailableEmployees();
			Optional<Employee> optional = usersAvailable.parallelStream().filter( employee -> employee.getUserId().toString().equals(value)).findFirst();
			return (optional.isPresent()) ? optional.get() : null;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof Employee) {
			Employee employee = (Employee) value;
			return employee.getUserId().toString();
		}
		return null;
	}
}
