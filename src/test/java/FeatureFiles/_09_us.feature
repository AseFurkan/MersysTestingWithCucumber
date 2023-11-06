Feature: Mersys Testing

     # AC09
 # 1. Kullanıcı, admin olarak sisteme başarılı bir şekilde giriş yapmalıdır.
 # 2. Kullanıcı, banka hesapları ekleyebilmelidir.
 # 3. Kullanıcı, banka hesaplarını düzenleyebilmelidir.
 # 4. Kullanıcı, banka hesaplarını silebilmelidir.
 # 5. Kullanıcı, Banka hesaplarını eklerken gerekli bilgileri girmelidir.
 # 6. Kullanıcı, Banka hesapları düzenlenirken geçerli bilgileri güncellemelidir.
 # 7. Banka hesapları silinirken kullanıcı, doğrulama adımını tamamlamalıdır.
 # 8. Banka hesapları, "Setup > Parameters" sekmesi altında bulunmalıdır.
 # 9. Sayfa üzerinde bir arama işlevi bulunmalıdır.
 # 10. Banka hesaplarını etkinleştirme ve devre dışı bırakma seçeneği sunulmalıdır.


    Background:
        Given Navigate to Campus
        When Enter username and password and click login button
        Then User should login successfully

    Scenario: Testing Bank Account
        Then Navigate to Bank Accounts
        And Create a new Bank Accounts
       # Then Updata the Bank Accounts
       # And Delete the Bank Accounts


