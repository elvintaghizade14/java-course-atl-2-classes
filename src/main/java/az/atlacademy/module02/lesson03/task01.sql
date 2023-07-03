SELECT *
FROM Products
WHERE length(ProductName) =
      (SELECT max(length(ProductName)) FROM Products);