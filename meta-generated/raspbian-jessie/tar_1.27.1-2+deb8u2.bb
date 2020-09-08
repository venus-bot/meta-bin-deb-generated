PACKAGES = "${PN} tar"
PROVIDES = "tar"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tar/tar_1.27.1-2+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_tar = "tar_1.27.1-2+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "b4a6909a131b4f33c45bf7497aad7daed7ea85053757ec8ea09ac860bc71e984"
SRC_URI[deb0.md5sum] = "5a590857a6ef5ec4c9476fdf8b7592c6"

RDEPENDS_${PN} = "libacl1 (>= 2.2.51-8) libc6 (>= 2.17) libselinux1 (>= 1.32)"
DEPENDS = "libacl1 libc6 libselinux1"


inherit deb_group

FILES_${PN} = " \
    ./bin/tar \
    ./etc/rmt \
    ./usr/lib/mime/packages/tar \
    ./usr/sbin/rmt-tar \
    ./usr/sbin/tarcat \
    ./usr/share/doc/tar/AUTHORS \
    ./usr/share/doc/tar/NEWS.Debian.gz \
    ./usr/share/doc/tar/NEWS.gz \
    ./usr/share/doc/tar/README.Debian \
    ./usr/share/doc/tar/THANKS.gz \
    ./usr/share/doc/tar/changelog.1.gz \
    ./usr/share/doc/tar/changelog.Debian.gz \
    ./usr/share/doc/tar/changelog.gz \
    ./usr/share/doc/tar/copyright \
    ./usr/share/locale/bg/LC_MESSAGES/tar.mo \
    ./usr/share/locale/ca/LC_MESSAGES/tar.mo \
    ./usr/share/locale/cs/LC_MESSAGES/tar.mo \
    ./usr/share/locale/da/LC_MESSAGES/tar.mo \
    ./usr/share/locale/de/LC_MESSAGES/tar.mo \
    ./usr/share/locale/el/LC_MESSAGES/tar.mo \
    ./usr/share/locale/eo/LC_MESSAGES/tar.mo \
    ./usr/share/locale/es/LC_MESSAGES/tar.mo \
    ./usr/share/locale/et/LC_MESSAGES/tar.mo \
    ./usr/share/locale/eu/LC_MESSAGES/tar.mo \
    ./usr/share/locale/fi/LC_MESSAGES/tar.mo \
    ./usr/share/locale/fr/LC_MESSAGES/tar.mo \
    ./usr/share/locale/ga/LC_MESSAGES/tar.mo \
    ./usr/share/locale/gl/LC_MESSAGES/tar.mo \
    ./usr/share/locale/hr/LC_MESSAGES/tar.mo \
    ./usr/share/locale/hu/LC_MESSAGES/tar.mo \
    ./usr/share/locale/id/LC_MESSAGES/tar.mo \
    ./usr/share/locale/it/LC_MESSAGES/tar.mo \
    ./usr/share/locale/ja/LC_MESSAGES/tar.mo \
    ./usr/share/locale/ko/LC_MESSAGES/tar.mo \
    ./usr/share/locale/ky/LC_MESSAGES/tar.mo \
    ./usr/share/locale/ms/LC_MESSAGES/tar.mo \
    ./usr/share/locale/nb/LC_MESSAGES/tar.mo \
    ./usr/share/locale/nl/LC_MESSAGES/tar.mo \
    ./usr/share/locale/pl/LC_MESSAGES/tar.mo \
    ./usr/share/locale/pt/LC_MESSAGES/tar.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/tar.mo \
    ./usr/share/locale/ro/LC_MESSAGES/tar.mo \
    ./usr/share/locale/ru/LC_MESSAGES/tar.mo \
    ./usr/share/locale/sk/LC_MESSAGES/tar.mo \
    ./usr/share/locale/sl/LC_MESSAGES/tar.mo \
    ./usr/share/locale/sv/LC_MESSAGES/tar.mo \
    ./usr/share/locale/tr/LC_MESSAGES/tar.mo \
    ./usr/share/locale/uk/LC_MESSAGES/tar.mo \
    ./usr/share/locale/vi/LC_MESSAGES/tar.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/tar.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/tar.mo \
    ./usr/share/man/man1/tar.1.gz \
    ./usr/share/man/man1/tarcat.1.gz \
    ./usr/share/man/man8/rmt-tar.8.gz\
"
