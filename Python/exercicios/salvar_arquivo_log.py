from pathlib import Path

LOG_FILE = Path(__file__).parent / 'salvar_arquivo_log.txt'



class Log:
    def _log(self, msg):
        raise NotImplementedError('Implemente o método log')

    def log_error(self, msg):
        return self._log(f'Error: {msg}')

    def log_success(self, msg):
        return self._log(f'Success: {msg}')


class LogFileMixin(Log):
    def _log(self, msg):
        print(msg)
        msg_fomatada = f'{msg} ({self.__class__.__name__})'
        with open(LOG_FILE, 'a') as arquivo:
            arquivo.write(msg_fomatada)
            arquivo.write('\n')



lf = LogFileMixin()
lf.log_error('qualquer coisa')
lf.log_success('Que legal')