import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  palns = [];

  constructor(private httpClient: HttpClient) {

  }

  ngOnInit(): void {

    this.httpClient.get(environment.API_HOST + '/plans').subscribe((response: any) => {
      console.log(response);
      this.palns = response.data;
    });
  }




}
