package fr.isika.cda23.project3.utils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import fr.isika.cda.entities.users.Employee;
import fr.isika.cda23.project3.presentation.managedBeans.TeamBean;

import java.util.List;

@FacesConverter(value = "employeeConverter")
public class EmployeeConverter implements Converter {
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			TeamBean teamBean = context.getApplication().evaluateExpressionGet(context, "#{teamBean}", TeamBean.class);
			List<Employee> userAccounts = teamBean.getUserAccounts();

			for (Employee employee : userAccounts) {
				if (employee.getUserId().toString().equals(value)) {
					return employee;
				}
			}
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
