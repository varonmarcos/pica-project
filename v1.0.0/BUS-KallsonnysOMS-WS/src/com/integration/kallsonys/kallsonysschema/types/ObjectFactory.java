
package com.integration.kallsonys.kallsonysschema.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.integration.kallsonys.kallsonysschema.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InfoCampaign_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoCampaign");
    private final static QName _InfoCustomer_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoCustomer");
    private final static QName _CampaignException_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "CampaignException");
    private final static QName _CustomerException_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "CustomerException");
    private final static QName _InfoOrderStatusResponse_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoOrderStatusResponse");
    private final static QName _GetOrderInfoId_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "getOrderInfoId");
    private final static QName _InfoOrder_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoOrder");
    private final static QName _InfoPaging_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoPaging");
    private final static QName _InfoOrderList_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoOrderList");
    private final static QName _InfoOrderDetailResponse_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoOrderDetailResponse");
    private final static QName _OrderException_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "OrderException");
    private final static QName _InfoIntialLogin_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoIntialLogin");
    private final static QName _InfoCustomerUpdated_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoCustomerUpdated");
    private final static QName _GetProductDetailId_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "getProductDetailId");
    private final static QName _InfoProductList_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoProductList");
    private final static QName _InfoLogin_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoLogin");
    private final static QName _ProductException_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "ProductException");
    private final static QName _GetCustomerInfoEmail_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "getCustomerInfoEmail");
    private final static QName _InfoCampaignList_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoCampaignList");
    private final static QName _InfoProduct_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoProduct");
    private final static QName _ProductDetailResponse_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "productDetailResponse");
    private final static QName _InfoDescriptionResponse_QNAME = new QName("http://kallsonys.integration.com/kallsonysschema/types", "infoDescriptionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.integration.kallsonys.kallsonysschema.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DescriptionResponse }
     * 
     */
    public DescriptionResponse createDescriptionResponse() {
        return new DescriptionResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Severity }
     * 
     */
    public Severity createSeverity() {
        return new Severity();
    }

    /**
     * Create an instance of {@link CampaignList }
     * 
     */
    public CampaignList createCampaignList() {
        return new CampaignList();
    }

    /**
     * Create an instance of {@link ProductDetailId }
     * 
     */
    public ProductDetailId createProductDetailId() {
        return new ProductDetailId();
    }

    /**
     * Create an instance of {@link ProductList }
     * 
     */
    public ProductList createProductList() {
        return new ProductList();
    }

    /**
     * Create an instance of {@link OrderList }
     * 
     */
    public OrderList createOrderList() {
        return new OrderList();
    }

    /**
     * Create an instance of {@link Filterlist }
     * 
     */
    public Filterlist createFilterlist() {
        return new Filterlist();
    }

    /**
     * Create an instance of {@link PagingDto }
     * 
     */
    public PagingDto createPagingDto() {
        return new PagingDto();
    }

    /**
     * Create an instance of {@link Campaign }
     * 
     */
    public Campaign createCampaign() {
        return new Campaign();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link GlobalException }
     * 
     */
    public GlobalException createGlobalException() {
        return new GlobalException();
    }

    /**
     * Create an instance of {@link InitialLoginDTO }
     * 
     */
    public InitialLoginDTO createInitialLoginDTO() {
        return new InitialLoginDTO();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Top5 }
     * 
     */
    public Top5 createTop5() {
        return new Top5();
    }

    /**
     * Create an instance of {@link PagingFilterItem }
     * 
     */
    public PagingFilterItem createPagingFilterItem() {
        return new PagingFilterItem();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link OrderInfoId }
     * 
     */
    public OrderInfoId createOrderInfoId() {
        return new OrderInfoId();
    }

    /**
     * Create an instance of {@link LoginDTO }
     * 
     */
    public LoginDTO createLoginDTO() {
        return new LoginDTO();
    }

    /**
     * Create an instance of {@link CustomerInfoEmail }
     * 
     */
    public CustomerInfoEmail createCustomerInfoEmail() {
        return new CustomerInfoEmail();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Campaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoCampaign")
    public JAXBElement<Campaign> createInfoCampaign(Campaign value) {
        return new JAXBElement<Campaign>(_InfoCampaign_QNAME, Campaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoCustomer")
    public JAXBElement<Customer> createInfoCustomer(Customer value) {
        return new JAXBElement<Customer>(_InfoCustomer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "CampaignException")
    public JAXBElement<GlobalException> createCampaignException(GlobalException value) {
        return new JAXBElement<GlobalException>(_CampaignException_QNAME, GlobalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "CustomerException")
    public JAXBElement<GlobalException> createCustomerException(GlobalException value) {
        return new JAXBElement<GlobalException>(_CustomerException_QNAME, GlobalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoOrderStatusResponse")
    public JAXBElement<Order> createInfoOrderStatusResponse(Order value) {
        return new JAXBElement<Order>(_InfoOrderStatusResponse_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInfoId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "getOrderInfoId")
    public JAXBElement<OrderInfoId> createGetOrderInfoId(OrderInfoId value) {
        return new JAXBElement<OrderInfoId>(_GetOrderInfoId_QNAME, OrderInfoId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoOrder")
    public JAXBElement<Order> createInfoOrder(Order value) {
        return new JAXBElement<Order>(_InfoOrder_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagingDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoPaging")
    public JAXBElement<PagingDto> createInfoPaging(PagingDto value) {
        return new JAXBElement<PagingDto>(_InfoPaging_QNAME, PagingDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoOrderList")
    public JAXBElement<OrderList> createInfoOrderList(OrderList value) {
        return new JAXBElement<OrderList>(_InfoOrderList_QNAME, OrderList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoOrderDetailResponse")
    public JAXBElement<Order> createInfoOrderDetailResponse(Order value) {
        return new JAXBElement<Order>(_InfoOrderDetailResponse_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "OrderException")
    public JAXBElement<GlobalException> createOrderException(GlobalException value) {
        return new JAXBElement<GlobalException>(_OrderException_QNAME, GlobalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitialLoginDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoIntialLogin")
    public JAXBElement<InitialLoginDTO> createInfoIntialLogin(InitialLoginDTO value) {
        return new JAXBElement<InitialLoginDTO>(_InfoIntialLogin_QNAME, InitialLoginDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoCustomerUpdated")
    public JAXBElement<Customer> createInfoCustomerUpdated(Customer value) {
        return new JAXBElement<Customer>(_InfoCustomerUpdated_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDetailId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "getProductDetailId")
    public JAXBElement<ProductDetailId> createGetProductDetailId(ProductDetailId value) {
        return new JAXBElement<ProductDetailId>(_GetProductDetailId_QNAME, ProductDetailId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoProductList")
    public JAXBElement<ProductList> createInfoProductList(ProductList value) {
        return new JAXBElement<ProductList>(_InfoProductList_QNAME, ProductList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoLogin")
    public JAXBElement<LoginDTO> createInfoLogin(LoginDTO value) {
        return new JAXBElement<LoginDTO>(_InfoLogin_QNAME, LoginDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "ProductException")
    public JAXBElement<GlobalException> createProductException(GlobalException value) {
        return new JAXBElement<GlobalException>(_ProductException_QNAME, GlobalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfoEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "getCustomerInfoEmail")
    public JAXBElement<CustomerInfoEmail> createGetCustomerInfoEmail(CustomerInfoEmail value) {
        return new JAXBElement<CustomerInfoEmail>(_GetCustomerInfoEmail_QNAME, CustomerInfoEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoCampaignList")
    public JAXBElement<CampaignList> createInfoCampaignList(CampaignList value) {
        return new JAXBElement<CampaignList>(_InfoCampaignList_QNAME, CampaignList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoProduct")
    public JAXBElement<Product> createInfoProduct(Product value) {
        return new JAXBElement<Product>(_InfoProduct_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "productDetailResponse")
    public JAXBElement<Product> createProductDetailResponse(Product value) {
        return new JAXBElement<Product>(_ProductDetailResponse_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kallsonys.integration.com/kallsonysschema/types", name = "infoDescriptionResponse")
    public JAXBElement<DescriptionResponse> createInfoDescriptionResponse(DescriptionResponse value) {
        return new JAXBElement<DescriptionResponse>(_InfoDescriptionResponse_QNAME, DescriptionResponse.class, null, value);
    }

}
