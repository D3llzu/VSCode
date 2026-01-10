"""[#5] Receba o nome completo de um funcionário e retorne a primeira letra de seu nome e seu 
sobrenome completo concatenado com a string @lp.com.br. Deverá ser apresentada a mensagem ao usuário 
contendo seu nome completo e seu email, conforme exemplo: Sr. Fulado de Tal, seu email é tal@lp.com.br"""

def gerar_email(nome):
    partes_nome = nome.split()
    primeiro_nome = partes_nome[0]
    sobrenome = partes_nome[-1]
    
    email = primeiro_nome[0].lower() + sobrenome.lower() + "@lp.com.br"
    return email

nome = input("Digite o nome completo do funcionário: ")

email = gerar_email(nome)

print("\n", nome, "seu email é", email)