PACKAGES = "${PN} libwrap0"
PROVIDES = "libwrap0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tcp-wrappers/libwrap0_7.6.q-25_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwrap0 = "libwrap0_7.6.q-25_armhf.deb"
SRC_URI[deb0.sha256sum] = "ba37ca05b7986875b3c9485de5afa49aecd65af6e1ebde2cb70cc283c973df35"
SRC_URI[deb0.md5sum] = "6870092de86101c134c4631faaf8b9af"

RDEPENDS_libwrap0 = "libc6 (>= 2.7) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libwrap0 = " \
    ./lib/arm-linux-gnueabihf/libwrap.so.0 \
    ./lib/arm-linux-gnueabihf/libwrap.so.0.7.6 \
    ./usr/share/doc/libwrap0/README.Debian \
    ./usr/share/doc/libwrap0/README.gz \
    ./usr/share/doc/libwrap0/changelog.Debian.gz \
    ./usr/share/doc/libwrap0/changelog.gz \
    ./usr/share/doc/libwrap0/copyright \
    ./usr/share/man/man5/hosts.allow.5.gz \
    ./usr/share/man/man5/hosts.deny.5.gz \
    ./usr/share/man/man5/hosts_access.5.gz \
    ./usr/share/man/man5/hosts_options.5.gz\
"
