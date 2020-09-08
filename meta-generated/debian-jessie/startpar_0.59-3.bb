PACKAGES = "${PN} startpar"
PROVIDES = "startpar"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/startpar/startpar_0.59-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_startpar = "startpar_0.59-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "64200a1a59dbc1a0314d4a95219b830af80202436aa50528c582fe9987adaa6b"
SRC_URI[deb0.md5sum] = "a76c9ab4fdc9b23e9c205261bbdbab68"

RDEPENDS_${PN} = "libc6 (>= 2.15)"
DEPENDS = "libc6"


inherit deb_group

FILES_${PN} = " \
    ./etc/init/startpar-bridge.conf \
    ./lib/startpar/startpar \
    ./lib/startpar/startpar-upstart-inject \
    ./usr/share/doc/startpar/changelog.Debian.gz \
    ./usr/share/doc/startpar/copyright \
    ./usr/share/man/man8/startpar-upstart-inject.8.gz \
    ./usr/share/man/man8/startpar.8.gz\
"
