import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class OrderService {
   products: ProductResponseModel[] = [];
   serverURL = environment.SERVER_URL;

  constructor(private http: HttpClient) {
  }

  getSingleOrder(orderId: Number) {
    return this.http.get<ProductResponseModel[]>(`${this.serverURL}orders/${orderId}`).toPromise();
  }
}
interface ProductResponseModel {
  id: number;
  name: string;
  description: string;
  price: number;
  quantityOrdered: number;
  image: string;
}
