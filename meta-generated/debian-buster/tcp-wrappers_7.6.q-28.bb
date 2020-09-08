PACKAGES = "${PN} libwrap0"
PROVIDES = "libwrap0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/t/tcp-wrappers/libwrap0_7.6.q-28_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwrap0 = "libwrap0_7.6.q-28_armhf.deb"
SRC_URI[deb0.sha256sum] = "58868e46920ac3447a7984463d269b712eff4096e8d2f07156fe0abe95078725"
SRC_URI[deb0.md5sum] = "568c2f54403e766fec9ff3d3c40da690"

RDEPENDS_libwrap0 = "libc6 (>= 2.11)"
DEPENDS = "libc6"


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
