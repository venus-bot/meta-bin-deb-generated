PACKAGES = "${PN} libgpg-error0"
PROVIDES = "libgpg-error0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libg/libgpg-error/libgpg-error0_1.17-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgpg-error0 = "libgpg-error0_1.17-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "6e644220fb22512f041f4712b1bd7733692e6af20ac90870992c251d57ba8d4e"
SRC_URI[deb0.md5sum] = "297a995c82eca590b58b186abdaece9a"

RDEPENDS_${PN}0 = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libgpg-error0 = " \
    ./lib/arm-linux-gnueabihf/libgpg-error.so.0 \
    ./lib/arm-linux-gnueabihf/libgpg-error.so.0.13.0 \
    ./usr/share/doc/libgpg-error0/README.gz \
    ./usr/share/doc/libgpg-error0/changelog.Debian.gz \
    ./usr/share/doc/libgpg-error0/changelog.gz \
    ./usr/share/doc/libgpg-error0/copyright \
    ./usr/share/locale/cs/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/da/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/de/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/eo/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/fr/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/it/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/ja/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/nl/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/pl/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/pt/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/ro/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/ru/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/sr/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/sv/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/uk/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/vi/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/libgpg-error.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/libgpg-error.mo\
"
