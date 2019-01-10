**Endpoints:**

POST - localhost:8080/data - wczytuje dane z plików do bazy H2

GET - localhost:8080/data/helmetsize/50 - zwraca JSON:
`{
    "id": 12321,
    "name": "???",
    "label": "???",
    "attributes": {
        "id": 3,
        "code": "helmetsize",
        "it_IT": "Tagliecasco",
        "en_GB": "\"Helmet Sizes\"",
        "en_IE": "\"Helmet Sizes\"",
        "pl_PL": "\"Rozmiar kasku\"",
        "nl_NL": "\"Maat Helmen\"",
        "nl_BE": "\"Maat Helmen\"",
        "nb_NO": "Hjelmstørrelse",
        "fi_FI": "\"Koko Kypärät\"",
        "en_US": "",
        "es_ES": "TamaÃ±odeCasco",
        "de_DE": "Helmgrößen",
        "de_CH": "Helmgrößen",
        "de_AT": "Helmgrößen",
        "da_DK": "Hjelmstørrelse",
        "fr_FR": "\"Taille Casque\"",
        "sv_SE": "\"Storlek Hjälmar\"",
        "cs_CZ": "\"Velikost helmy\""
    },
    "options": {
        "id": 5,
        "code": "50",
        "es_ES": "50",
        "nl_NL": "50",
        "nl_BE": "50",
        "nb_NO": "50",
        "it_IT": "50",
        "fr_FR": "50",
        "fi_FI": "50",
        "en_US": "",
        "sv_SE": "50",
        "en_IE": "",
        "en_GB": "50",
        "de_DE": "50",
        "de_CH": "50",
        "de_AT": "50",
        "da_DK": "50",
        "cs_CZ": "50",
        "pl_PL": "50",
        "attribute": "helmetsize",
        "sort_order": "4"
    }
}`

GET - localhost:8080/data/pl_PL/helmetsize/52 - zwraca JSON:
`{
    "label": "pl_PL",
    "attributes": "\"Rozmiar kasku\"",
    "options": "52"
}`