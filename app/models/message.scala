package models

// a class with two attributes: id & label
case class Message(id: Long, label: String)

// 3 methods: all <- get all messages
// create <- create new messages, delete 
object Message {
	def all(): List[Message] = messageList
	def creat(label: String) {}
	def delete(id: Long) {}
	var messageList:List[Message] = new Message(1, "this")::new Message(2, "is")::Nil
}
