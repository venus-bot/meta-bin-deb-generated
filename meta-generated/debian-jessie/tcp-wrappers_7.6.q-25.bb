PACKAGES = "${PN} libwrap0"
PROVIDES = "libwrap0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/t/tcp-wrappers/libwrap0_7.6.q-25_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwrap0 = "libwrap0_7.6.q-25_armhf.deb"
SRC_URI[deb0.sha256sum] = "379c7cb0d2948b39dc51391bd90b8a9842c6a1cc82076b4640a746d7d9fe6054"
SRC_URI[deb0.md5sum] = "e51cde58fe7e8d7dcd11d27294d1141a"

RDEPENDS_libwrap0 = "libc6 (>= 2.11) multiarch-support"
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
