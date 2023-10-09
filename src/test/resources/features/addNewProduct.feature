Feature: Admin Add New Product

  Background: Login With Admin Account
    Given user navigate to Login page "http://localhost:5173/login"
    When user enter email "thuan@gmail.com" and password: "thuan123"
    And click login button
    Then user should see admin product page

  @EmptyProductName
  Scenario: Empty Product Name
    Given user click add new product button
    When user input product name is ""
    And submit click add new product button
    Then user should see an error name message bellow textbox product name "Bắt buộc điền tên sản phẩm có độ dài tối đa 255 ký tự"


  @ProductNameOver255Characters
  Scenario: Product Name Over 255 Characters
    Given user click add new product button
    When user input product name is "THIS STRING IS 256 CHARACTERS xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
    And submit click add new product button
    Then user should see an error name message bellow textbox product name "Bắt buộc điền tên sản phẩm có độ dài tối đa 255 ký tự"

  @EmptyProductPrice
  Scenario: Empty Product Price
    Given user click add new product button
    When user input product price is ""
    And submit click add new product button
    Then user should see an error name message bellow textbox product price "Bắt buộc nhập giá"

  @EmptyProductCategory
  Scenario: Empty Product Category
    Given user click add new product button
    When user input product category is ""
    And submit click add new product button
    Then user should see an error name message bellow textbox product category "Bắt buộc chọn danh mục"

  @EmptyProductQuantity
  Scenario: Empty Product Quantity
    Given user click add new product button
    When user input product quantity is ""
    And submit click add new product button
    Then user should see an error name message bellow textbox product quantity "Bắt buộc nhập số lượng"

  @EmptyProductDateOfManufacture
  Scenario: Empty Product Date Of Manufacture
    Given user click add new product button
    When user input product date of manufacture is "2025/01/01"
    And submit click add new product button
    Then user should see an error name message bellow textbox product date of manufacture "Bắt buộc nhập ngày sản xuất hợp lệ"

  @EmptyProductImage
  Scenario: Empty Product Image
    Given user click add new product button
    When user not select image
    And submit click add new product button
    Then user should see an error name message bellow textbox product image "Bắt buộc tải lên ảnh"

  @SuccessfulAddNewProduct
  Scenario Outline: Add New Product
    Given user click add new product button
    When user input product information "<name>", "<describe>", "<price>", "<category>", "<quantity>" , "<date of manufacture>" and path image "<Image>"
    And submit click add new product button
    Then the list product page display new product on top list products with name is "<name>"
    Examples:
      | name             | describe                       | price    | category | quantity | date of manufacture | Image                  |
      | Tụ gốm 104       | sản phẩm mới nhất của cửa hàng | 150000   | Tụ điện  | 150      | 2023/10/10          | F:\\LuanVan\\104pi.jpg|


