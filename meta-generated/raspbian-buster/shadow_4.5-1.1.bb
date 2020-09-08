PACKAGES = "${PN} login passwd"
PROVIDES = "login passwd"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/shadow/login_4.5-1.1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/s/shadow/passwd_4.5-1.1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_login = "login_4.5-1.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6244360424c6df1302c87837ee6a65f48ec2beb1b11fc36f787c2607e08cc27c"
SRC_URI[deb0.md5sum] = "690e9b5a07bed923dffab70a64fa3314"
DEBFILENAME_passwd = "passwd_4.5-1.1_armhf.deb"
SRC_URI[deb1.sha256sum] = "beae91f59bddfe2ca8bf99a70131263d120ada1bdee6d1b3bb46cf96093c44b3"
SRC_URI[deb1.md5sum] = "7dfee803dfd9e174bf40f546dc4c989c"

RDEPENDS_login = "libaudit1 (>= 1:2.2.1) libc6 (>= 2.7) libpam-modules (>= 1.1.8-1) libpam-runtime libpam0g (>= 0.99.7.1)"
RDEPENDS_passwd = "libaudit1 (>= 1:2.2.1) libc6 (>= 2.8) libpam-modules libpam0g (>= 0.99.7.1) libselinux1 (>= 1.32) libsemanage1 (>= 2.0.3)"
DEPENDS = "libaudit1 libc6 libpam-modules libpam-runtime libpam0g libselinux1 libsemanage1"


inherit deb_group

FILES_login = " \
    ./bin/login \
    ./etc/login.defs \
    ./etc/pam.d/login \
    ./etc/securetty \
    ./usr/bin/faillog \
    ./usr/bin/lastlog \
    ./usr/bin/newgrp \
    ./usr/bin/sg \
    ./usr/sbin/nologin \
    ./usr/share/doc/login/NEWS.Debian.gz \
    ./usr/share/doc/login/NEWS.gz \
    ./usr/share/doc/login/README \
    ./usr/share/doc/login/TODO.gz \
    ./usr/share/doc/login/changelog.Debian.gz \
    ./usr/share/doc/login/changelog.gz \
    ./usr/share/doc/login/copyright \
    ./usr/share/lintian/overrides/login \
    ./usr/share/locale/bs/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/ca/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/cs/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/da/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/de/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/dz/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/el/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/es/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/eu/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/fi/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/fr/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/gl/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/he/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/hu/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/id/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/it/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/ja/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/kk/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/km/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/ko/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/nb/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/ne/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/nl/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/nn/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/pl/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/pt/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/ro/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/ru/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/sk/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/sq/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/sv/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/tl/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/tr/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/uk/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/vi/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/shadow.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/shadow.mo \
    ./usr/share/man/cs/man5/faillog.5.gz \
    ./usr/share/man/cs/man8/faillog.8.gz \
    ./usr/share/man/cs/man8/lastlog.8.gz \
    ./usr/share/man/cs/man8/nologin.8.gz \
    ./usr/share/man/da/man1/newgrp.1.gz \
    ./usr/share/man/da/man1/sg.1.gz \
    ./usr/share/man/da/man8/nologin.8.gz \
    ./usr/share/man/de/man1/login.1.gz \
    ./usr/share/man/de/man1/newgrp.1.gz \
    ./usr/share/man/de/man1/sg.1.gz \
    ./usr/share/man/de/man5/faillog.5.gz \
    ./usr/share/man/de/man5/login.defs.5.gz \
    ./usr/share/man/de/man8/faillog.8.gz \
    ./usr/share/man/de/man8/lastlog.8.gz \
    ./usr/share/man/de/man8/nologin.8.gz \
    ./usr/share/man/fr/man1/login.1.gz \
    ./usr/share/man/fr/man1/newgrp.1.gz \
    ./usr/share/man/fr/man1/sg.1.gz \
    ./usr/share/man/fr/man5/faillog.5.gz \
    ./usr/share/man/fr/man5/login.defs.5.gz \
    ./usr/share/man/fr/man8/faillog.8.gz \
    ./usr/share/man/fr/man8/lastlog.8.gz \
    ./usr/share/man/fr/man8/nologin.8.gz \
    ./usr/share/man/hu/man1/login.1.gz \
    ./usr/share/man/hu/man1/newgrp.1.gz \
    ./usr/share/man/hu/man1/sg.1.gz \
    ./usr/share/man/hu/man8/lastlog.8.gz \
    ./usr/share/man/id/man1/login.1.gz \
    ./usr/share/man/it/man1/login.1.gz \
    ./usr/share/man/it/man1/newgrp.1.gz \
    ./usr/share/man/it/man1/sg.1.gz \
    ./usr/share/man/it/man5/faillog.5.gz \
    ./usr/share/man/it/man5/login.defs.5.gz \
    ./usr/share/man/it/man8/faillog.8.gz \
    ./usr/share/man/it/man8/lastlog.8.gz \
    ./usr/share/man/it/man8/nologin.8.gz \
    ./usr/share/man/ja/man1/login.1.gz \
    ./usr/share/man/ja/man1/newgrp.1.gz \
    ./usr/share/man/ja/man1/sg.1.gz \
    ./usr/share/man/ja/man5/faillog.5.gz \
    ./usr/share/man/ja/man5/login.defs.5.gz \
    ./usr/share/man/ja/man8/faillog.8.gz \
    ./usr/share/man/ja/man8/lastlog.8.gz \
    ./usr/share/man/ko/man1/login.1.gz \
    ./usr/share/man/man1/login.1.gz \
    ./usr/share/man/man1/newgrp.1.gz \
    ./usr/share/man/man1/sg.1.gz \
    ./usr/share/man/man5/faillog.5.gz \
    ./usr/share/man/man5/login.defs.5.gz \
    ./usr/share/man/man8/faillog.8.gz \
    ./usr/share/man/man8/lastlog.8.gz \
    ./usr/share/man/man8/nologin.8.gz \
    ./usr/share/man/pl/man1/newgrp.1.gz \
    ./usr/share/man/pl/man1/sg.1.gz \
    ./usr/share/man/pl/man5/faillog.5.gz \
    ./usr/share/man/pl/man8/faillog.8.gz \
    ./usr/share/man/pl/man8/lastlog.8.gz \
    ./usr/share/man/ru/man1/login.1.gz \
    ./usr/share/man/ru/man1/newgrp.1.gz \
    ./usr/share/man/ru/man1/sg.1.gz \
    ./usr/share/man/ru/man5/faillog.5.gz \
    ./usr/share/man/ru/man5/login.defs.5.gz \
    ./usr/share/man/ru/man8/faillog.8.gz \
    ./usr/share/man/ru/man8/lastlog.8.gz \
    ./usr/share/man/ru/man8/nologin.8.gz \
    ./usr/share/man/sv/man1/newgrp.1.gz \
    ./usr/share/man/sv/man1/sg.1.gz \
    ./usr/share/man/sv/man5/faillog.5.gz \
    ./usr/share/man/sv/man8/faillog.8.gz \
    ./usr/share/man/sv/man8/lastlog.8.gz \
    ./usr/share/man/sv/man8/nologin.8.gz \
    ./usr/share/man/tr/man1/login.1.gz \
    ./usr/share/man/zh_CN/man1/login.1.gz \
    ./usr/share/man/zh_CN/man1/newgrp.1.gz \
    ./usr/share/man/zh_CN/man1/sg.1.gz \
    ./usr/share/man/zh_CN/man5/faillog.5.gz \
    ./usr/share/man/zh_CN/man5/login.defs.5.gz \
    ./usr/share/man/zh_CN/man8/faillog.8.gz \
    ./usr/share/man/zh_CN/man8/lastlog.8.gz \
    ./usr/share/man/zh_CN/man8/nologin.8.gz \
    ./usr/share/man/zh_TW/man1/newgrp.1.gz\
"
FILES_passwd = " \
    ./etc/cron.daily/passwd \
    ./etc/default/useradd \
    ./etc/pam.d/chfn \
    ./etc/pam.d/chpasswd \
    ./etc/pam.d/chsh \
    ./etc/pam.d/newusers \
    ./etc/pam.d/passwd \
    ./sbin/shadowconfig \
    ./usr/bin/chage \
    ./usr/bin/chfn \
    ./usr/bin/chsh \
    ./usr/bin/expiry \
    ./usr/bin/gpasswd \
    ./usr/bin/passwd \
    ./usr/lib/tmpfiles.d/passwd.conf \
    ./usr/sbin/chgpasswd \
    ./usr/sbin/chpasswd \
    ./usr/sbin/cpgr \
    ./usr/sbin/cppw \
    ./usr/sbin/groupadd \
    ./usr/sbin/groupdel \
    ./usr/sbin/groupmems \
    ./usr/sbin/groupmod \
    ./usr/sbin/grpck \
    ./usr/sbin/grpconv \
    ./usr/sbin/grpunconv \
    ./usr/sbin/newusers \
    ./usr/sbin/pwck \
    ./usr/sbin/pwconv \
    ./usr/sbin/pwunconv \
    ./usr/sbin/useradd \
    ./usr/sbin/userdel \
    ./usr/sbin/usermod \
    ./usr/sbin/vigr \
    ./usr/sbin/vipw \
    ./usr/share/doc/passwd/NEWS.Debian.gz \
    ./usr/share/doc/passwd/NEWS.gz \
    ./usr/share/doc/passwd/README \
    ./usr/share/doc/passwd/README.Debian \
    ./usr/share/doc/passwd/TODO.Debian \
    ./usr/share/doc/passwd/TODO.gz \
    ./usr/share/doc/passwd/changelog.Debian.gz \
    ./usr/share/doc/passwd/changelog.gz \
    ./usr/share/doc/passwd/copyright \
    ./usr/share/doc/passwd/examples/passwd.expire.cron \
    ./usr/share/lintian/overrides/passwd \
    ./usr/share/man/cs/man1/expiry.1.gz \
    ./usr/share/man/cs/man1/gpasswd.1.gz \
    ./usr/share/man/cs/man5/gshadow.5.gz \
    ./usr/share/man/cs/man5/passwd.5.gz \
    ./usr/share/man/cs/man5/shadow.5.gz \
    ./usr/share/man/cs/man8/groupadd.8.gz \
    ./usr/share/man/cs/man8/groupdel.8.gz \
    ./usr/share/man/cs/man8/groupmod.8.gz \
    ./usr/share/man/cs/man8/grpck.8.gz \
    ./usr/share/man/cs/man8/vipw.8.gz \
    ./usr/share/man/da/man1/chfn.1.gz \
    ./usr/share/man/da/man5/gshadow.5.gz \
    ./usr/share/man/da/man8/groupdel.8.gz \
    ./usr/share/man/da/man8/vigr.8.gz \
    ./usr/share/man/da/man8/vipw.8.gz \
    ./usr/share/man/de/man1/chage.1.gz \
    ./usr/share/man/de/man1/chfn.1.gz \
    ./usr/share/man/de/man1/chsh.1.gz \
    ./usr/share/man/de/man1/expiry.1.gz \
    ./usr/share/man/de/man1/gpasswd.1.gz \
    ./usr/share/man/de/man1/passwd.1.gz \
    ./usr/share/man/de/man5/gshadow.5.gz \
    ./usr/share/man/de/man5/passwd.5.gz \
    ./usr/share/man/de/man5/shadow.5.gz \
    ./usr/share/man/de/man8/chpasswd.8.gz \
    ./usr/share/man/de/man8/groupadd.8.gz \
    ./usr/share/man/de/man8/groupdel.8.gz \
    ./usr/share/man/de/man8/groupmems.8.gz \
    ./usr/share/man/de/man8/groupmod.8.gz \
    ./usr/share/man/de/man8/grpck.8.gz \
    ./usr/share/man/de/man8/grpconv.8.gz \
    ./usr/share/man/de/man8/grpunconv.8.gz \
    ./usr/share/man/de/man8/newusers.8.gz \
    ./usr/share/man/de/man8/pwck.8.gz \
    ./usr/share/man/de/man8/pwconv.8.gz \
    ./usr/share/man/de/man8/pwunconv.8.gz \
    ./usr/share/man/de/man8/useradd.8.gz \
    ./usr/share/man/de/man8/userdel.8.gz \
    ./usr/share/man/de/man8/usermod.8.gz \
    ./usr/share/man/de/man8/vigr.8.gz \
    ./usr/share/man/de/man8/vipw.8.gz \
    ./usr/share/man/fi/man1/chfn.1.gz \
    ./usr/share/man/fi/man1/chsh.1.gz \
    ./usr/share/man/fr/man1/chage.1.gz \
    ./usr/share/man/fr/man1/chfn.1.gz \
    ./usr/share/man/fr/man1/chsh.1.gz \
    ./usr/share/man/fr/man1/expiry.1.gz \
    ./usr/share/man/fr/man1/gpasswd.1.gz \
    ./usr/share/man/fr/man1/passwd.1.gz \
    ./usr/share/man/fr/man5/gshadow.5.gz \
    ./usr/share/man/fr/man5/passwd.5.gz \
    ./usr/share/man/fr/man5/shadow.5.gz \
    ./usr/share/man/fr/man8/chpasswd.8.gz \
    ./usr/share/man/fr/man8/groupadd.8.gz \
    ./usr/share/man/fr/man8/groupdel.8.gz \
    ./usr/share/man/fr/man8/groupmems.8.gz \
    ./usr/share/man/fr/man8/groupmod.8.gz \
    ./usr/share/man/fr/man8/grpck.8.gz \
    ./usr/share/man/fr/man8/grpconv.8.gz \
    ./usr/share/man/fr/man8/grpunconv.8.gz \
    ./usr/share/man/fr/man8/newusers.8.gz \
    ./usr/share/man/fr/man8/pwck.8.gz \
    ./usr/share/man/fr/man8/pwconv.8.gz \
    ./usr/share/man/fr/man8/pwunconv.8.gz \
    ./usr/share/man/fr/man8/shadowconfig.8.gz \
    ./usr/share/man/fr/man8/useradd.8.gz \
    ./usr/share/man/fr/man8/userdel.8.gz \
    ./usr/share/man/fr/man8/usermod.8.gz \
    ./usr/share/man/fr/man8/vigr.8.gz \
    ./usr/share/man/fr/man8/vipw.8.gz \
    ./usr/share/man/hu/man1/chsh.1.gz \
    ./usr/share/man/hu/man1/gpasswd.1.gz \
    ./usr/share/man/hu/man1/passwd.1.gz \
    ./usr/share/man/hu/man5/passwd.5.gz \
    ./usr/share/man/id/man1/chsh.1.gz \
    ./usr/share/man/id/man8/useradd.8.gz \
    ./usr/share/man/it/man1/chage.1.gz \
    ./usr/share/man/it/man1/chfn.1.gz \
    ./usr/share/man/it/man1/chsh.1.gz \
    ./usr/share/man/it/man1/expiry.1.gz \
    ./usr/share/man/it/man1/gpasswd.1.gz \
    ./usr/share/man/it/man1/passwd.1.gz \
    ./usr/share/man/it/man5/gshadow.5.gz \
    ./usr/share/man/it/man5/passwd.5.gz \
    ./usr/share/man/it/man5/shadow.5.gz \
    ./usr/share/man/it/man8/chpasswd.8.gz \
    ./usr/share/man/it/man8/groupadd.8.gz \
    ./usr/share/man/it/man8/groupdel.8.gz \
    ./usr/share/man/it/man8/groupmems.8.gz \
    ./usr/share/man/it/man8/groupmod.8.gz \
    ./usr/share/man/it/man8/grpck.8.gz \
    ./usr/share/man/it/man8/grpconv.8.gz \
    ./usr/share/man/it/man8/grpunconv.8.gz \
    ./usr/share/man/it/man8/newusers.8.gz \
    ./usr/share/man/it/man8/pwck.8.gz \
    ./usr/share/man/it/man8/pwconv.8.gz \
    ./usr/share/man/it/man8/pwunconv.8.gz \
    ./usr/share/man/it/man8/useradd.8.gz \
    ./usr/share/man/it/man8/userdel.8.gz \
    ./usr/share/man/it/man8/usermod.8.gz \
    ./usr/share/man/it/man8/vigr.8.gz \
    ./usr/share/man/it/man8/vipw.8.gz \
    ./usr/share/man/ja/man1/chage.1.gz \
    ./usr/share/man/ja/man1/chfn.1.gz \
    ./usr/share/man/ja/man1/chsh.1.gz \
    ./usr/share/man/ja/man1/expiry.1.gz \
    ./usr/share/man/ja/man1/gpasswd.1.gz \
    ./usr/share/man/ja/man1/passwd.1.gz \
    ./usr/share/man/ja/man5/passwd.5.gz \
    ./usr/share/man/ja/man5/shadow.5.gz \
    ./usr/share/man/ja/man8/chpasswd.8.gz \
    ./usr/share/man/ja/man8/groupadd.8.gz \
    ./usr/share/man/ja/man8/groupdel.8.gz \
    ./usr/share/man/ja/man8/groupmod.8.gz \
    ./usr/share/man/ja/man8/grpck.8.gz \
    ./usr/share/man/ja/man8/grpconv.8.gz \
    ./usr/share/man/ja/man8/grpunconv.8.gz \
    ./usr/share/man/ja/man8/newusers.8.gz \
    ./usr/share/man/ja/man8/pwck.8.gz \
    ./usr/share/man/ja/man8/pwconv.8.gz \
    ./usr/share/man/ja/man8/pwunconv.8.gz \
    ./usr/share/man/ja/man8/shadowconfig.8.gz \
    ./usr/share/man/ja/man8/useradd.8.gz \
    ./usr/share/man/ja/man8/userdel.8.gz \
    ./usr/share/man/ja/man8/usermod.8.gz \
    ./usr/share/man/ja/man8/vigr.8.gz \
    ./usr/share/man/ja/man8/vipw.8.gz \
    ./usr/share/man/ko/man1/chfn.1.gz \
    ./usr/share/man/ko/man1/chsh.1.gz \
    ./usr/share/man/ko/man5/passwd.5.gz \
    ./usr/share/man/ko/man8/vigr.8.gz \
    ./usr/share/man/ko/man8/vipw.8.gz \
    ./usr/share/man/man1/chage.1.gz \
    ./usr/share/man/man1/chfn.1.gz \
    ./usr/share/man/man1/chsh.1.gz \
    ./usr/share/man/man1/expiry.1.gz \
    ./usr/share/man/man1/gpasswd.1.gz \
    ./usr/share/man/man1/passwd.1.gz \
    ./usr/share/man/man5/gshadow.5.gz \
    ./usr/share/man/man5/passwd.5.gz \
    ./usr/share/man/man5/shadow.5.gz \
    ./usr/share/man/man5/subgid.5.gz \
    ./usr/share/man/man5/subuid.5.gz \
    ./usr/share/man/man8/chgpasswd.8.gz \
    ./usr/share/man/man8/chpasswd.8.gz \
    ./usr/share/man/man8/cpgr.8.gz \
    ./usr/share/man/man8/cppw.8.gz \
    ./usr/share/man/man8/groupadd.8.gz \
    ./usr/share/man/man8/groupdel.8.gz \
    ./usr/share/man/man8/groupmod.8.gz \
    ./usr/share/man/man8/grpck.8.gz \
    ./usr/share/man/man8/grpconv.8.gz \
    ./usr/share/man/man8/grpunconv.8.gz \
    ./usr/share/man/man8/newusers.8.gz \
    ./usr/share/man/man8/pwck.8.gz \
    ./usr/share/man/man8/pwconv.8.gz \
    ./usr/share/man/man8/pwunconv.8.gz \
    ./usr/share/man/man8/shadowconfig.8.gz \
    ./usr/share/man/man8/useradd.8.gz \
    ./usr/share/man/man8/userdel.8.gz \
    ./usr/share/man/man8/usermod.8.gz \
    ./usr/share/man/man8/vigr.8.gz \
    ./usr/share/man/man8/vipw.8.gz \
    ./usr/share/man/pl/man1/chage.1.gz \
    ./usr/share/man/pl/man1/chsh.1.gz \
    ./usr/share/man/pl/man1/expiry.1.gz \
    ./usr/share/man/pl/man8/groupadd.8.gz \
    ./usr/share/man/pl/man8/groupdel.8.gz \
    ./usr/share/man/pl/man8/groupmems.8.gz \
    ./usr/share/man/pl/man8/groupmod.8.gz \
    ./usr/share/man/pl/man8/grpck.8.gz \
    ./usr/share/man/pl/man8/shadowconfig.8.gz \
    ./usr/share/man/pl/man8/userdel.8.gz \
    ./usr/share/man/pl/man8/usermod.8.gz \
    ./usr/share/man/pl/man8/vigr.8.gz \
    ./usr/share/man/pl/man8/vipw.8.gz \
    ./usr/share/man/pt_BR/man1/gpasswd.1.gz \
    ./usr/share/man/pt_BR/man5/passwd.5.gz \
    ./usr/share/man/pt_BR/man5/shadow.5.gz \
    ./usr/share/man/pt_BR/man8/groupadd.8.gz \
    ./usr/share/man/pt_BR/man8/groupdel.8.gz \
    ./usr/share/man/pt_BR/man8/groupmod.8.gz \
    ./usr/share/man/ru/man1/chage.1.gz \
    ./usr/share/man/ru/man1/chfn.1.gz \
    ./usr/share/man/ru/man1/chsh.1.gz \
    ./usr/share/man/ru/man1/expiry.1.gz \
    ./usr/share/man/ru/man1/gpasswd.1.gz \
    ./usr/share/man/ru/man1/passwd.1.gz \
    ./usr/share/man/ru/man5/gshadow.5.gz \
    ./usr/share/man/ru/man5/passwd.5.gz \
    ./usr/share/man/ru/man5/shadow.5.gz \
    ./usr/share/man/ru/man8/chpasswd.8.gz \
    ./usr/share/man/ru/man8/groupadd.8.gz \
    ./usr/share/man/ru/man8/groupdel.8.gz \
    ./usr/share/man/ru/man8/groupmems.8.gz \
    ./usr/share/man/ru/man8/groupmod.8.gz \
    ./usr/share/man/ru/man8/grpck.8.gz \
    ./usr/share/man/ru/man8/grpconv.8.gz \
    ./usr/share/man/ru/man8/grpunconv.8.gz \
    ./usr/share/man/ru/man8/newusers.8.gz \
    ./usr/share/man/ru/man8/pwck.8.gz \
    ./usr/share/man/ru/man8/pwconv.8.gz \
    ./usr/share/man/ru/man8/pwunconv.8.gz \
    ./usr/share/man/ru/man8/useradd.8.gz \
    ./usr/share/man/ru/man8/userdel.8.gz \
    ./usr/share/man/ru/man8/usermod.8.gz \
    ./usr/share/man/ru/man8/vigr.8.gz \
    ./usr/share/man/ru/man8/vipw.8.gz \
    ./usr/share/man/sv/man1/chage.1.gz \
    ./usr/share/man/sv/man1/chsh.1.gz \
    ./usr/share/man/sv/man1/expiry.1.gz \
    ./usr/share/man/sv/man1/passwd.1.gz \
    ./usr/share/man/sv/man5/gshadow.5.gz \
    ./usr/share/man/sv/man5/passwd.5.gz \
    ./usr/share/man/sv/man8/groupadd.8.gz \
    ./usr/share/man/sv/man8/groupdel.8.gz \
    ./usr/share/man/sv/man8/groupmems.8.gz \
    ./usr/share/man/sv/man8/groupmod.8.gz \
    ./usr/share/man/sv/man8/grpck.8.gz \
    ./usr/share/man/sv/man8/pwck.8.gz \
    ./usr/share/man/sv/man8/userdel.8.gz \
    ./usr/share/man/sv/man8/vigr.8.gz \
    ./usr/share/man/sv/man8/vipw.8.gz \
    ./usr/share/man/tr/man1/chage.1.gz \
    ./usr/share/man/tr/man1/chfn.1.gz \
    ./usr/share/man/tr/man1/passwd.1.gz \
    ./usr/share/man/tr/man5/passwd.5.gz \
    ./usr/share/man/tr/man5/shadow.5.gz \
    ./usr/share/man/tr/man8/groupadd.8.gz \
    ./usr/share/man/tr/man8/groupdel.8.gz \
    ./usr/share/man/tr/man8/groupmod.8.gz \
    ./usr/share/man/tr/man8/useradd.8.gz \
    ./usr/share/man/tr/man8/userdel.8.gz \
    ./usr/share/man/tr/man8/usermod.8.gz \
    ./usr/share/man/zh_CN/man1/chage.1.gz \
    ./usr/share/man/zh_CN/man1/chfn.1.gz \
    ./usr/share/man/zh_CN/man1/chsh.1.gz \
    ./usr/share/man/zh_CN/man1/expiry.1.gz \
    ./usr/share/man/zh_CN/man1/gpasswd.1.gz \
    ./usr/share/man/zh_CN/man1/passwd.1.gz \
    ./usr/share/man/zh_CN/man5/gshadow.5.gz \
    ./usr/share/man/zh_CN/man5/passwd.5.gz \
    ./usr/share/man/zh_CN/man5/shadow.5.gz \
    ./usr/share/man/zh_CN/man8/chpasswd.8.gz \
    ./usr/share/man/zh_CN/man8/groupadd.8.gz \
    ./usr/share/man/zh_CN/man8/groupdel.8.gz \
    ./usr/share/man/zh_CN/man8/groupmems.8.gz \
    ./usr/share/man/zh_CN/man8/groupmod.8.gz \
    ./usr/share/man/zh_CN/man8/grpck.8.gz \
    ./usr/share/man/zh_CN/man8/grpconv.8.gz \
    ./usr/share/man/zh_CN/man8/grpunconv.8.gz \
    ./usr/share/man/zh_CN/man8/newusers.8.gz \
    ./usr/share/man/zh_CN/man8/pwck.8.gz \
    ./usr/share/man/zh_CN/man8/pwconv.8.gz \
    ./usr/share/man/zh_CN/man8/pwunconv.8.gz \
    ./usr/share/man/zh_CN/man8/useradd.8.gz \
    ./usr/share/man/zh_CN/man8/userdel.8.gz \
    ./usr/share/man/zh_CN/man8/usermod.8.gz \
    ./usr/share/man/zh_CN/man8/vigr.8.gz \
    ./usr/share/man/zh_CN/man8/vipw.8.gz \
    ./usr/share/man/zh_TW/man1/chfn.1.gz \
    ./usr/share/man/zh_TW/man1/chsh.1.gz \
    ./usr/share/man/zh_TW/man5/passwd.5.gz \
    ./usr/share/man/zh_TW/man8/chpasswd.8.gz \
    ./usr/share/man/zh_TW/man8/groupadd.8.gz \
    ./usr/share/man/zh_TW/man8/groupdel.8.gz \
    ./usr/share/man/zh_TW/man8/groupmod.8.gz \
    ./usr/share/man/zh_TW/man8/useradd.8.gz \
    ./usr/share/man/zh_TW/man8/userdel.8.gz \
    ./usr/share/man/zh_TW/man8/usermod.8.gz\
"
