import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  private url = 'https://blogtai.herokuapp.com';

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get(this.url + '/api/posts/');
  }

  getById(id) {
    return this.http.get(this.url + '/api/posts/' + id);
  }

  getByText(data) {
    return this.http.post(this.url + '/api/posts/', data);
  }
}
