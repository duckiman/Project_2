export interface ProductModelServer {
  id: number;
  name: string;
  cat_id: number;
  price: number;
  description: string;
  quantity: number;
  image: string;
}

export interface ServerResponse{
  products: ProductModelServer[];
}
