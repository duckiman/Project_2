export interface ProductModelServer {
  id: number;
  name: string;
  category: string;
  price: number;
  description: string;
  quantity: number;
  image: string;
}

export interface ServerResponse{
  count:number;
  products: ProductModelServer[]
}
