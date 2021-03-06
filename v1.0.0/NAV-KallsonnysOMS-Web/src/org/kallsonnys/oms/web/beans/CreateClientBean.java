package org.kallsonnys.oms.web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.kallsonnys.oms.dto.AddressDTO;
import org.kallsonnys.oms.dto.CustomerDTO;
import org.kallsonnys.oms.enums.AddressTypeEnum;
import org.kallsonnys.oms.enums.CountryEnum;
import org.kallsonnys.oms.enums.CustomerStatusEnum;
import org.kallsonnys.oms.utilities.Util;

@ManagedBean(name = "createClient")
@ViewScoped
public class CreateClientBean implements Serializable {
	
	private static final long serialVersionUID = -2152389656664659476L;
	
	private Long inputId;
	private String inputName;
	private String inputSname;
	private String inputPhone;
	private String inputEmail;
	private CustomerStatusEnum slState;
	private List<CustomerStatusEnum> status;
	private List<CountryEnum> countrys;
	private List<CountryEnum> countrysB;
	
	private CountryEnum slCountryShip;
	private String inputZoneShip;
	private String inputAddrShip;
	
	private CountryEnum slCountryBill;
	private String inputZoneBill;
	private String inputAddrBill;
	
	private List<String> dptos;
	private List<String> citys;
	private List<String> dptosB;
	private List<String> citysB;
	private String subDptoShip;
	private String subCityShip;
	
	private String subDptoBill;
	private String subCityBill;
	
	private String messageHeader;
	private String messageBody;
	private Severity severity;
	
	public CreateClientBean(){
	}

	public void create(ActionEvent actionEvent) throws Exception{
		CustomerDTO customer = new CustomerDTO();
		
		try {
			customer.setId(inputId);
			customer.setName(inputName);
			customer.setSurname(inputSname);
			customer.setPhoneNumber(inputPhone);
			customer.setEmail(inputEmail);
			customer.setStatus(slState);
			
			List<AddressDTO> customerAddress = new ArrayList<AddressDTO>();
			AddressDTO adrShip = new AddressDTO();
			adrShip.setAddresstype(AddressTypeEnum.SHIPPING_ADDRESS);
			adrShip.setCountry(slCountryShip);
			adrShip.setStateName(subDptoShip);
			adrShip.setCityName(subCityShip);
			adrShip.setZip(inputZoneShip);
			adrShip.setStreet(inputAddrShip);		
			customerAddress.add(adrShip);
			AddressDTO adrBill = new AddressDTO();
			adrBill.setAddresstype(AddressTypeEnum.BILLING_ADDRESS);
			adrBill.setCountry(slCountryBill);
			adrBill.setStateName(subDptoBill);
			adrBill.setCityName(subCityBill);
			adrBill.setZip(inputZoneBill);
			adrBill.setStreet(inputAddrBill);	
			customerAddress.add(adrBill);
			
			customer.setCustomerAddress(customerAddress);
			
			
			System.out.println("customer.getId() " + customer.getId());
			System.out.println("customer.getName() " + customer.getName());
			System.out.println("customer.getSurname() " + customer.getSurname());
			System.out.println("customer.getPhoneNumber() " + customer.getPhoneNumber());
			System.out.println("customer.getEmail() " + customer.getEmail());
			System.out.println("customer.gegetStatustId() " + customer.getStatus());
			System.out.println("customer.getAddresstype() " + customer.getCustomerAddress().get(0).getAddresstype());
			System.out.println("customer.getCountry() " + customer.getCustomerAddress().get(0).getCountry());
			System.out.println("customer.getStateName() " + customer.getCustomerAddress().get(0).getStateName());
			System.out.println("customer.getCityName() " + customer.getCustomerAddress().get(0).getCityName());
			System.out.println("customer.getAddresstype() " + customer.getCustomerAddress().get(0).getStreet());
			System.out.println("customer.getStreet() " + customer.getCustomerAddress().get(0).getZip());
			System.out.println("customer.getAddresstype() " + customer.getCustomerAddress().get(1).getAddresstype());
			System.out.println("customer.getCountry() " + customer.getCustomerAddress().get(1).getCountry());
			System.out.println("customer.getStateName() " + customer.getCustomerAddress().get(1).getStateName());
			System.out.println("customer.getCityName() " + customer.getCustomerAddress().get(1).getCityName());
			System.out.println("customer.getAddresstype() " + customer.getCustomerAddress().get(1).getStreet());
			System.out.println("customer.getStreet() " + customer.getCustomerAddress().get(1).getZip());
			
			
			//invocacion al EJB
			
			FacesContext.getCurrentInstance().getExternalContext().redirect("manageClient.xhtml?id="+customer.getId()+"&state=OK");
		}catch (Exception e) {
			e.printStackTrace();
			messageHeader = "Error al modificar el cliente ";
			messageBody =  customer.getId().toString();
			severity = FacesMessage.SEVERITY_ERROR;			
			Util.addMessage(severity, messageHeader, messageBody);
		}
		
	}
	
	public void handleDptoChange() {  
		System.out.println("subDptoShip " + subDptoShip);
        if(subDptoShip !=null && !subDptoShip.equals(""))  
        	citys = loadCitys(citys, subDptoShip); 
    }
	
	public void handleCountryChange() {  
		System.out.println("slCountryShip " + slCountryShip);
        if(slCountryShip !=null && !slCountryShip.equals(""))  
        	dptos = loadDptos(dptos, slCountryShip); 
    }
	
	public void handleDptoChangeB() {  
		System.out.println("subDptoBill " + subDptoBill);
        if(subDptoBill !=null && !subDptoBill.equals(""))  
        	citysB = loadCitys(citysB, subDptoBill); 
    }
	
	public void handleCountryChangeB() {  
		System.out.println("slCountryBill " + slCountryBill);
        if(slCountryBill !=null && !slCountryBill.equals(""))  
        	dptosB = loadDptos(dptosB, slCountryBill); 
    }
	
	
	private List<String> loadDptos(List<String> list, CountryEnum slCountryShip){
		list = new ArrayList<String>();
		
		if (slCountryShip.equals(CountryEnum.COLOMBIA)){
			list.add("Cundinamarca");
			list.add("Antioquia");
			list.add("Tolima");
			list.add("Boyaca");
		}
		
		if (slCountryShip.equals(CountryEnum.ENGLAND)){
			list.add("Gran Manchester");
			list.add("Cheshire");
			list.add("Ruteoland");
			list.add("Derbyshire");
		}
		
		if (slCountryShip.equals(CountryEnum.USA)){
			list.add("Colorado");
			list.add("California");
			list.add("Texas");
			list.add("Florida");
		}
		
		return list;		
	}

	
	
	private List<String> loadCitys(List<String> list, String subDpto){
		list = new ArrayList<String>();
		
		if (subDpto.equals("Cundinamarca")){
			list.add("Soacha");
			list.add("Girardot");
		}
		
		if (subDpto.equals("Antioquia")){
			list.add("Medellin");
			list.add("Envigado");
		}
		
		if (subDpto.equals("Tolima")){
			list.add("Fresno");
			list.add("Ibague");
		}
		
		if (subDpto.equals("Boyaca")){
			list.add("Duitama");
			list.add("Sogamoso");
		}
		
		if (subDpto.equals("Gran Manchester")){
			list.add("Derby");
			list.add("Ripley");
		}
		
		if (subDpto.equals("Cheshire")){
			list.add("Bolton");
			list.add("Wigan");
		}
		
		if (subDpto.equals("Ruteoland")){
			list.add("Chester");
			list.add("Northwich");
		}
		
		if (subDpto.equals("Derbyshire")){
			list.add("Bridge");
			list.add("Tottenham");
		}

		if (subDpto.equals("Colorado")){
			list.add("Denver");
			list.add("Washington");
		}
			
		if (subDpto.equals("California")){
			list.add("San Francisco");
			list.add("Los Angeles");
		}
		
		if (subDpto.equals("Texas")){
			list.add("Dallas");
			list.add("Houston");
		}
		
		if (subDpto.equals("Florida")){
			list.add("Miami");
			list.add("Atlantis");
		}
		
		return list;		
	}
	
	
	public Long getInputId() {
		return inputId;
	}

	public void setInputId(Long 	inputId) {
		this.inputId = inputId;
	}

	public String getInputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	public String getInputSname() {
		return inputSname;
	}

	public void setInputSname(String inputSname) {
		this.inputSname = inputSname;
	}

	public String getInputPhone() {
		return inputPhone;
	}

	public void setInputPhone(String inputPhone) {
		this.inputPhone = inputPhone;
	}

	public String getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}
	
	public List<CustomerStatusEnum> getStatus() {
		status = new ArrayList<CustomerStatusEnum>();
		status.add(CustomerStatusEnum.PLATINUM);
		status.add(CustomerStatusEnum.GOLDEN);
		status.add(CustomerStatusEnum.SILVER);
		status.add(CustomerStatusEnum.DISABLED);
		return status;
	}

	public void setStatus(List<CustomerStatusEnum> status) {
		this.status = status;
	}

	public List<CountryEnum> getCountrys() {
		countrys = new ArrayList<CountryEnum>();
		countrys.add(CountryEnum.COLOMBIA);
		countrys.add(CountryEnum.ENGLAND);
		countrys.add(CountryEnum.USA);
		return countrys;
	}

	public void setCountrys(List<CountryEnum> countrys) {
		this.countrys = countrys;
	}

	public String getInputZoneShip() {
		return inputZoneShip;
	}

	public void setInputZoneShip(String inputZoneShip) {
		this.inputZoneShip = inputZoneShip;
	}

	public String getInputAddrShip() {
		return inputAddrShip;
	}

	public void setInputAddrShip(String inputAddrShip) {
		this.inputAddrShip = inputAddrShip;
	}

	public String getInputZoneBill() {
		return inputZoneBill;
	}

	public void setInputZoneBill(String inputZoneBill) {
		this.inputZoneBill = inputZoneBill;
	}

	public String getInputAddrBill() {
		return inputAddrBill;
	}

	public void setInputAddrBill(String inputAddrBill) {
		this.inputAddrBill = inputAddrBill;
	}

	public CustomerStatusEnum getSlState() {
		return slState;
	}

	public void setSlState(CustomerStatusEnum slState) {
		this.slState = slState;
	}

	public CountryEnum getSlCountryShip() {
		return slCountryShip;
	}

	public void setSlCountryShip(CountryEnum slCountryShip) {
		this.slCountryShip = slCountryShip;
	}

	public CountryEnum getSlCountryBill() {
		return slCountryBill;
	}

	public void setSlCountryBill(CountryEnum slCountryBill) {
		this.slCountryBill = slCountryBill;
	}

	public List<String> getDptos() {
		return dptos;
	}

	public void setDptos(List<String> dptos) {
		this.dptos = dptos;
	}

	public List<String> getCitys() {
		return citys;
	}

	public void setCitys(List<String> citys) {
		
		this.citys = citys;
	}

	public String getSubDptoShip() {
		return subDptoShip;
	}

	public void setSubDptoShip(String subDptoShip) {
		this.subDptoShip = subDptoShip;
	}

	public String getSubCityShip() {
		return subCityShip;
	}

	public void setSubCityShip(String subCityShip) {
		this.subCityShip = subCityShip;
	}
	
	public String getSubDptoBill() {
		return subDptoBill;
	}

	public void setSubDptoBill(String subDptoBill) {
		this.subDptoBill = subDptoBill;
	}

	public String getSubCityBill() {
		return subCityBill;
	}

	public void setSubCityBill(String subCityBill) {
		this.subCityBill = subCityBill;
	}

	public List<CountryEnum> getCountrysB() {
		countrysB = new ArrayList<CountryEnum>();
		countrysB.add(CountryEnum.COLOMBIA);
		countrysB.add(CountryEnum.ENGLAND);
		countrysB.add(CountryEnum.USA);
		return countrysB;
	}

	public void setCountrysB(List<CountryEnum> countrysB) {
		this.countrysB = countrysB;
	}

	public List<String> getDptosB() {
		return dptosB;
	}

	public void setDptosB(List<String> dptosB) {
		this.dptosB = dptosB;
	}

	public List<String> getCitysB() {
		return citysB;
	}

	public void setCitysB(List<String> citysB) {
		this.citysB = citysB;
	}
	
	
}
