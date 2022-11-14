import React, { Component } from "react";
import "./chatList.css";
import ChatListItems from "./ChatListItems";

export default class ChatList extends Component {
  allChatUsers = [
    {
      image:
        "",
      id: 1,
      name: "sandeep",
      active: true,
      isOnline: true,
    },
    {
      image:
        "https://pbs.twimg.com/profile_images/1055263632861343745/vIqzOHXj.jpg",
      id: 2,
      name: "ramchandu",
      active: false,
      isOnline: false,
    },
    {
      image:
        "",
      id: 3,
      name: "arun",
      active: false,
      isOnline: false,
    },
    {
      image:
        "",
      id: 4,
      name: "Ashish",
      active: false,
      isOnline: true,
    },
    {
      image:
        "",
      id: 5,
      name: "Satish",
      active: false,
      isOnline: false,
    },
    {
      image:
        "",
      id: 6,
      name: "Karthik",
      active: false,
      isOnline: true,
    },
    {
      image:
        "",
      id: 7,
      name: "virat",
      active: false,
      isOnline: true,
    },
    {
      image:
        "https://auraqatar.com/projects/Anakalabel/media//vesbrand/designer4.jpg",
      id: 8,
      name: "dhoni",
      active: false,
      isOnline: false,
    },
    {
      image:
        "",
      id: 9,
      name: "ronaldo",
      active: false,
      isOnline: true,
    },
    {
      image: "",
      id: 10,
      name: "siraj",
      active: false,
      isOnline: true,
    },
  ];
  constructor(props) {
    super(props);
    this.state = {
      allChats: this.allChatUsers,
    };
  }
  render() {
    return (
      <div className="main__chatlist">
        <button className="btn">
          <i className="fa fa-plus"></i>
          <span>New conversation</span>
        </button>
        <div className="chatlist__heading">
          <h2>Chats</h2>
          <button className="btn-nobg">
            <i className="fa fa-ellipsis-h"></i>
          </button>
        </div>
        <div className="chatList__search">
          <div className="search_wrap">
            <input type="text" placeholder="Search Here" required />
            <button className="search-btn">
              <i className="fa fa-search"></i>
            </button>
          </div>
        </div>
        <div className="chatlist__items">
          {this.state.allChats.map((item, index) => {
            return (
              <ChatListItems
                name={item.name}
                key={item.id}
                animationDelay={index + 1}
                active={item.active ? "active" : ""}
                isOnline={item.isOnline ? "active" : ""}
                image={item.image}
              />
            );
          })}
        </div>
      </div>
    );
  }
}
