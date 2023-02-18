import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  private products: ProductResponseModel[] = [];
  private serverURL = environment.SERVER_URL;

  constructor(private http: HttpClient) {
  }


  getSingleOrder(orderId: number) {
    return this.http.get<ProductResponseModel[]>(this.serverURL+'/orders'+orderId).toPromise();
  }
}

interface ProductResponseModel {
  id: Number;
  name: String;
  description: String;
  price: Number;
  quantityOrdered: Number;
  image: String;
}
