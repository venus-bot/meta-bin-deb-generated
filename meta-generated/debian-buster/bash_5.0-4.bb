PACKAGES = "${PN} bash"
PROVIDES = "bash"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/bash/bash_5.0-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_bash = "bash_5.0-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "9e5bcb9e06db9a9d77bb7849a336664ae18a7a6027281002efd9bd1ddf6ac186"
SRC_URI[deb0.md5sum] = "2db2cc5acbe842fe74712cf76c044daf"

RDEPENDS_${PN} = "base-files (>= 2.1.12) debianutils (>= 2.15) libc6 (>= 2.28) libtinfo6 (>= 6)"
DEPENDS = "base-files debianutils libc6 libtinfo6"


inherit deb_group

FILES_${PN} = " \
    ./bin/bash \
    ./bin/rbash \
    ./etc/bash.bashrc \
    ./etc/skel/.bash_logout \
    ./etc/skel/.bashrc \
    ./etc/skel/.profile \
    ./usr/bin/bashbug \
    ./usr/bin/clear_console \
    ./usr/share/doc/bash/CHANGES.gz \
    ./usr/share/doc/bash/COMPAT.gz \
    ./usr/share/doc/bash/INTRO.gz \
    ./usr/share/doc/bash/NEWS.gz \
    ./usr/share/doc/bash/POSIX.gz \
    ./usr/share/doc/bash/RBASH \
    ./usr/share/doc/bash/README.Debian.gz \
    ./usr/share/doc/bash/README.abs-guide \
    ./usr/share/doc/bash/README.commands.gz \
    ./usr/share/doc/bash/README.gz \
    ./usr/share/doc/bash/changelog.Debian.gz \
    ./usr/share/doc/bash/changelog.gz \
    ./usr/share/doc/bash/copyright \
    ./usr/share/doc/bash/inputrc.arrows \
    ./usr/share/lintian/overrides/bash \
    ./usr/share/locale/af/LC_MESSAGES/bash.mo \
    ./usr/share/locale/bg/LC_MESSAGES/bash.mo \
    ./usr/share/locale/ca/LC_MESSAGES/bash.mo \
    ./usr/share/locale/cs/LC_MESSAGES/bash.mo \
    ./usr/share/locale/da/LC_MESSAGES/bash.mo \
    ./usr/share/locale/de/LC_MESSAGES/bash.mo \
    ./usr/share/locale/el/LC_MESSAGES/bash.mo \
    ./usr/share/locale/en@boldquot/LC_MESSAGES/bash.mo \
    ./usr/share/locale/en@quot/LC_MESSAGES/bash.mo \
    ./usr/share/locale/eo/LC_MESSAGES/bash.mo \
    ./usr/share/locale/es/LC_MESSAGES/bash.mo \
    ./usr/share/locale/et/LC_MESSAGES/bash.mo \
    ./usr/share/locale/fi/LC_MESSAGES/bash.mo \
    ./usr/share/locale/fr/LC_MESSAGES/bash.mo \
    ./usr/share/locale/ga/LC_MESSAGES/bash.mo \
    ./usr/share/locale/gl/LC_MESSAGES/bash.mo \
    ./usr/share/locale/hr/LC_MESSAGES/bash.mo \
    ./usr/share/locale/hu/LC_MESSAGES/bash.mo \
    ./usr/share/locale/id/LC_MESSAGES/bash.mo \
    ./usr/share/locale/it/LC_MESSAGES/bash.mo \
    ./usr/share/locale/ja/LC_MESSAGES/bash.mo \
    ./usr/share/locale/lt/LC_MESSAGES/bash.mo \
    ./usr/share/locale/nb/LC_MESSAGES/bash.mo \
    ./usr/share/locale/nl/LC_MESSAGES/bash.mo \
    ./usr/share/locale/pl/LC_MESSAGES/bash.mo \
    ./usr/share/locale/pt/LC_MESSAGES/bash.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/bash.mo \
    ./usr/share/locale/ro/LC_MESSAGES/bash.mo \
    ./usr/share/locale/ru/LC_MESSAGES/bash.mo \
    ./usr/share/locale/sk/LC_MESSAGES/bash.mo \
    ./usr/share/locale/sl/LC_MESSAGES/bash.mo \
    ./usr/share/locale/sr/LC_MESSAGES/bash.mo \
    ./usr/share/locale/sv/LC_MESSAGES/bash.mo \
    ./usr/share/locale/tr/LC_MESSAGES/bash.mo \
    ./usr/share/locale/uk/LC_MESSAGES/bash.mo \
    ./usr/share/locale/vi/LC_MESSAGES/bash.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/bash.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/bash.mo \
    ./usr/share/man/man1/bash.1.gz \
    ./usr/share/man/man1/bashbug.1.gz \
    ./usr/share/man/man1/clear_console.1.gz \
    ./usr/share/man/man1/rbash.1.gz \
    ./usr/share/man/man7/bash-builtins.7.gz \
    ./usr/share/menu/bash\
"
