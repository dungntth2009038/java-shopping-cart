package com.example.shopping_cart.controller.product.client;

public class ListProductClient extends HttpServlet {
    private ProductModel productModel;

    public ListProductClient() {
        this.productModel = new MySqlProductModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", productModel.findAll());
        req.getRequestDispatcher("/client/product/list.jsp").forward(req, resp);
    }
}
