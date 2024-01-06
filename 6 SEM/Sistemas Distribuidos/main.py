import tkinter as tk
from tkinter import messagebox

class TicketSystem:
    def __init__(self, root):
        self.root = root
        self.root.title("Sistema de Retirada de Senhas")

        self.queue = []
        self.priority_queue = []

        self.current_ticket = 1

        self.label = tk.Label(root, text="Bem-vindo ao sistema de retirada de senhas!")
        self.label.pack(pady=10)

        self.take_ticket_button = tk.Button(root, text="Retirar Senha", command=self.take_ticket)
        self.take_ticket_button.pack(pady=5)

        #self.call_ticket_button = tk.Button(root, text="Chamar Próxima Senha", command=self.call_next_ticket)
        #self.call_ticket_button.pack(pady=5)   app so para chamar senhas

        self.priority_var = tk.BooleanVar(value=False)
        self.priority_checkbox = tk.Checkbutton(root, text="Prioridade", variable=self.priority_var)
        self.priority_checkbox.pack()

    def take_ticket(self):
        priority = self.priority_var.get()
        if priority:
            self.queue.insert(0, (1, self.current_ticket))
        else:
            self.queue.append((0, self.current_ticket))
        messagebox.showinfo("Senha Retirada", f"Sua senha é a {self.current_ticket} (Prioridade: {priority})")
        self.current_ticket += 1

    def call_next_ticket(self):
        if self.queue:
            _, next_ticket = self.queue.pop(0)
            messagebox.showinfo("Chamada de Senha", f"Próxima senha: {next_ticket}")
        else:
            messagebox.showinfo("Sem Senhas", "Não há senhas na fila.")

if __name__ == "__main__":
    root = tk.Tk()
    app = TicketSystem(root)
    root.mainloop()