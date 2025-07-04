# 🚛 frete-tomate

Serviço GraphQL que calcula o custo de frete para uma entrega de caixas de tomate com base na quantidade e distância.

## 🚀 Como rodar

```bash
cd frete-tomate
mvn spring-boot:run
```

Acessar o GraphiQL em: [http://localhost:8081/graphiql](http://localhost:8081/graphiql)

## ✅ Query

```graphql
query {
  frete(quantidade: 300, distancia: 150) {
    precoFrete
    veiculo
  }
}
```

### 📤 Exemplo de resposta:

```json
{
  "data": {
    "frete": {
      "precoFrete": 11300.0,
      "veiculo": "carreta"
    }
  }
}
```
