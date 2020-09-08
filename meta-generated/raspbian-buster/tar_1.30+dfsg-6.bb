PACKAGES = "${PN} tar"
PROVIDES = "tar"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tar/tar_1.30+dfsg-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_tar = "tar_1.30+dfsg-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "82e15802c5c14bf10394fed7bab66bf21476def1d587cbbf64bfbd7a8b8bcdd5"
SRC_URI[deb0.md5sum] = "780d4142e35e9ea4f15846f918c4a6b9"

RDEPENDS_${PN} = "libacl1 (>= 2.2.23) libc6 (>= 2.28) libselinux1 (>= 1.32)"
DEPENDS = "libacl1 libc6 libselinux1"


inherit deb_group

FILES_${PN} = " \
    ./bin/tar \
    ./etc/rmt \
    ./usr/lib/mime/packages/tar \
    ./usr/sbin/rmt-tar \
    ./usr/sbin/tarcat \
    ./usr/share/doc/tar/AUTHORS \
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
    ./usr/share/locale/sr/LC_MESSAGES/tar.mo \
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
