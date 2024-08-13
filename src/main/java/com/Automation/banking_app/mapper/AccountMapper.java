package com.Automation.banking_app.mapper;

import com.Automation.banking_app.dto.AccountDto;
import com.Automation.banking_app.entity.Account;

public class AccountMapper {

public static Account mapToAccount(AccountDto accountDto) {
    if (accountDto.getId() != null) {
        return new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
    } else {
        return new Account(
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
    }
}

    public static AccountDto mapToAccountDto(Account account) {
        return new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
    }
}
