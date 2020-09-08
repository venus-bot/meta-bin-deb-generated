PACKAGES = "${PN} linux-libc-dev"
PROVIDES = "linux-libc-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/l/linux/linux-libc-dev_3.16.56-1+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_linux-libc-dev = "linux-libc-dev_3.16.56-1+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8c0ebe33bc26b8925eea5f29cdd719b9f78abe60b9ce077761caeece32dfb736"
SRC_URI[deb0.md5sum] = "8c9b65422c90c8f862164431792bb943"

RDEPENDS_${PN}-libc-dev = ""

inherit deb_group

FILES_linux-libc-dev = " \
    ./usr/include/arm-linux-gnueabihf/asm/auxvec.h \
    ./usr/include/arm-linux-gnueabihf/asm/bitsperlong.h \
    ./usr/include/arm-linux-gnueabihf/asm/byteorder.h \
    ./usr/include/arm-linux-gnueabihf/asm/errno.h \
    ./usr/include/arm-linux-gnueabihf/asm/fcntl.h \
    ./usr/include/arm-linux-gnueabihf/asm/hwcap.h \
    ./usr/include/arm-linux-gnueabihf/asm/ioctl.h \
    ./usr/include/arm-linux-gnueabihf/asm/ioctls.h \
    ./usr/include/arm-linux-gnueabihf/asm/ipcbuf.h \
    ./usr/include/arm-linux-gnueabihf/asm/kvm.h \
    ./usr/include/arm-linux-gnueabihf/asm/kvm_para.h \
    ./usr/include/arm-linux-gnueabihf/asm/mman.h \
    ./usr/include/arm-linux-gnueabihf/asm/msgbuf.h \
    ./usr/include/arm-linux-gnueabihf/asm/param.h \
    ./usr/include/arm-linux-gnueabihf/asm/perf_regs.h \
    ./usr/include/arm-linux-gnueabihf/asm/poll.h \
    ./usr/include/arm-linux-gnueabihf/asm/posix_types.h \
    ./usr/include/arm-linux-gnueabihf/asm/ptrace.h \
    ./usr/include/arm-linux-gnueabihf/asm/resource.h \
    ./usr/include/arm-linux-gnueabihf/asm/sembuf.h \
    ./usr/include/arm-linux-gnueabihf/asm/setup.h \
    ./usr/include/arm-linux-gnueabihf/asm/shmbuf.h \
    ./usr/include/arm-linux-gnueabihf/asm/sigcontext.h \
    ./usr/include/arm-linux-gnueabihf/asm/siginfo.h \
    ./usr/include/arm-linux-gnueabihf/asm/signal.h \
    ./usr/include/arm-linux-gnueabihf/asm/socket.h \
    ./usr/include/arm-linux-gnueabihf/asm/sockios.h \
    ./usr/include/arm-linux-gnueabihf/asm/stat.h \
    ./usr/include/arm-linux-gnueabihf/asm/statfs.h \
    ./usr/include/arm-linux-gnueabihf/asm/swab.h \
    ./usr/include/arm-linux-gnueabihf/asm/termbits.h \
    ./usr/include/arm-linux-gnueabihf/asm/termios.h \
    ./usr/include/arm-linux-gnueabihf/asm/types.h \
    ./usr/include/arm-linux-gnueabihf/asm/unistd.h \
    ./usr/include/asm-generic/auxvec.h \
    ./usr/include/asm-generic/bitsperlong.h \
    ./usr/include/asm-generic/errno-base.h \
    ./usr/include/asm-generic/errno.h \
    ./usr/include/asm-generic/fcntl.h \
    ./usr/include/asm-generic/int-l64.h \
    ./usr/include/asm-generic/int-ll64.h \
    ./usr/include/asm-generic/ioctl.h \
    ./usr/include/asm-generic/ioctls.h \
    ./usr/include/asm-generic/ipcbuf.h \
    ./usr/include/asm-generic/kvm_para.h \
    ./usr/include/asm-generic/mman-common.h \
    ./usr/include/asm-generic/mman.h \
    ./usr/include/asm-generic/msgbuf.h \
    ./usr/include/asm-generic/param.h \
    ./usr/include/asm-generic/poll.h \
    ./usr/include/asm-generic/posix_types.h \
    ./usr/include/asm-generic/resource.h \
    ./usr/include/asm-generic/sembuf.h \
    ./usr/include/asm-generic/setup.h \
    ./usr/include/asm-generic/shmbuf.h \
    ./usr/include/asm-generic/shmparam.h \
    ./usr/include/asm-generic/siginfo.h \
    ./usr/include/asm-generic/signal-defs.h \
    ./usr/include/asm-generic/signal.h \
    ./usr/include/asm-generic/socket.h \
    ./usr/include/asm-generic/sockios.h \
    ./usr/include/asm-generic/stat.h \
    ./usr/include/asm-generic/statfs.h \
    ./usr/include/asm-generic/swab.h \
    ./usr/include/asm-generic/termbits.h \
    ./usr/include/asm-generic/termios.h \
    ./usr/include/asm-generic/types.h \
    ./usr/include/asm-generic/ucontext.h \
    ./usr/include/asm-generic/unistd.h \
    ./usr/include/linux/acct.h \
    ./usr/include/linux/adb.h \
    ./usr/include/linux/adfs_fs.h \
    ./usr/include/linux/affs_hardblocks.h \
    ./usr/include/linux/agpgart.h \
    ./usr/include/linux/aio_abi.h \
    ./usr/include/linux/apm_bios.h \
    ./usr/include/linux/arcfb.h \
    ./usr/include/linux/atalk.h \
    ./usr/include/linux/atm.h \
    ./usr/include/linux/atm_eni.h \
    ./usr/include/linux/atm_he.h \
    ./usr/include/linux/atm_idt77105.h \
    ./usr/include/linux/atm_nicstar.h \
    ./usr/include/linux/atm_tcp.h \
    ./usr/include/linux/atm_zatm.h \
    ./usr/include/linux/atmapi.h \
    ./usr/include/linux/atmarp.h \
    ./usr/include/linux/atmbr2684.h \
    ./usr/include/linux/atmclip.h \
    ./usr/include/linux/atmdev.h \
    ./usr/include/linux/atmioc.h \
    ./usr/include/linux/atmlec.h \
    ./usr/include/linux/atmmpc.h \
    ./usr/include/linux/atmppp.h \
    ./usr/include/linux/atmsap.h \
    ./usr/include/linux/atmsvc.h \
    ./usr/include/linux/audit.h \
    ./usr/include/linux/aufs_type.h \
    ./usr/include/linux/auto_fs.h \
    ./usr/include/linux/auto_fs4.h \
    ./usr/include/linux/auxvec.h \
    ./usr/include/linux/ax25.h \
    ./usr/include/linux/b1lli.h \
    ./usr/include/linux/baycom.h \
    ./usr/include/linux/bcm933xx_hcs.h \
    ./usr/include/linux/bfs_fs.h \
    ./usr/include/linux/binfmts.h \
    ./usr/include/linux/blkpg.h \
    ./usr/include/linux/blktrace_api.h \
    ./usr/include/linux/bpqether.h \
    ./usr/include/linux/bsg.h \
    ./usr/include/linux/btrfs.h \
    ./usr/include/linux/byteorder/big_endian.h \
    ./usr/include/linux/byteorder/little_endian.h \
    ./usr/include/linux/caif/caif_socket.h \
    ./usr/include/linux/caif/if_caif.h \
    ./usr/include/linux/can.h \
    ./usr/include/linux/can/bcm.h \
    ./usr/include/linux/can/error.h \
    ./usr/include/linux/can/gw.h \
    ./usr/include/linux/can/netlink.h \
    ./usr/include/linux/can/raw.h \
    ./usr/include/linux/capability.h \
    ./usr/include/linux/capi.h \
    ./usr/include/linux/cciss_defs.h \
    ./usr/include/linux/cciss_ioctl.h \
    ./usr/include/linux/cdrom.h \
    ./usr/include/linux/cgroupstats.h \
    ./usr/include/linux/chio.h \
    ./usr/include/linux/cm4000_cs.h \
    ./usr/include/linux/cn_proc.h \
    ./usr/include/linux/coda.h \
    ./usr/include/linux/coda_psdev.h \
    ./usr/include/linux/coff.h \
    ./usr/include/linux/connector.h \
    ./usr/include/linux/const.h \
    ./usr/include/linux/cramfs_fs.h \
    ./usr/include/linux/cuda.h \
    ./usr/include/linux/cyclades.h \
    ./usr/include/linux/cycx_cfm.h \
    ./usr/include/linux/dcbnl.h \
    ./usr/include/linux/dccp.h \
    ./usr/include/linux/dlm.h \
    ./usr/include/linux/dlm_device.h \
    ./usr/include/linux/dlm_netlink.h \
    ./usr/include/linux/dlm_plock.h \
    ./usr/include/linux/dlmconstants.h \
    ./usr/include/linux/dm-ioctl.h \
    ./usr/include/linux/dm-log-userspace.h \
    ./usr/include/linux/dn.h \
    ./usr/include/linux/dqblk_xfs.h \
    ./usr/include/linux/dvb/audio.h \
    ./usr/include/linux/dvb/ca.h \
    ./usr/include/linux/dvb/dmx.h \
    ./usr/include/linux/dvb/frontend.h \
    ./usr/include/linux/dvb/net.h \
    ./usr/include/linux/dvb/osd.h \
    ./usr/include/linux/dvb/version.h \
    ./usr/include/linux/dvb/video.h \
    ./usr/include/linux/edd.h \
    ./usr/include/linux/efs_fs_sb.h \
    ./usr/include/linux/elf-em.h \
    ./usr/include/linux/elf-fdpic.h \
    ./usr/include/linux/elf.h \
    ./usr/include/linux/elfcore.h \
    ./usr/include/linux/errno.h \
    ./usr/include/linux/errqueue.h \
    ./usr/include/linux/ethtool.h \
    ./usr/include/linux/eventpoll.h \
    ./usr/include/linux/fadvise.h \
    ./usr/include/linux/falloc.h \
    ./usr/include/linux/fanotify.h \
    ./usr/include/linux/fb.h \
    ./usr/include/linux/fcntl.h \
    ./usr/include/linux/fd.h \
    ./usr/include/linux/fdreg.h \
    ./usr/include/linux/fib_rules.h \
    ./usr/include/linux/fiemap.h \
    ./usr/include/linux/filter.h \
    ./usr/include/linux/firewire-cdev.h \
    ./usr/include/linux/firewire-constants.h \
    ./usr/include/linux/flat.h \
    ./usr/include/linux/fs.h \
    ./usr/include/linux/fsl_hypervisor.h \
    ./usr/include/linux/fuse.h \
    ./usr/include/linux/futex.h \
    ./usr/include/linux/gameport.h \
    ./usr/include/linux/gen_stats.h \
    ./usr/include/linux/genetlink.h \
    ./usr/include/linux/gfs2_ondisk.h \
    ./usr/include/linux/gigaset_dev.h \
    ./usr/include/linux/hdlc.h \
    ./usr/include/linux/hdlc/ioctl.h \
    ./usr/include/linux/hdlcdrv.h \
    ./usr/include/linux/hdreg.h \
    ./usr/include/linux/hid.h \
    ./usr/include/linux/hiddev.h \
    ./usr/include/linux/hidraw.h \
    ./usr/include/linux/hpet.h \
    ./usr/include/linux/hsi/hsi_char.h \
    ./usr/include/linux/hw_breakpoint.h \
    ./usr/include/linux/hyperv.h \
    ./usr/include/linux/hysdn_if.h \
    ./usr/include/linux/i2c-dev.h \
    ./usr/include/linux/i2c.h \
    ./usr/include/linux/i2o-dev.h \
    ./usr/include/linux/i8k.h \
    ./usr/include/linux/icmp.h \
    ./usr/include/linux/icmpv6.h \
    ./usr/include/linux/if.h \
    ./usr/include/linux/if_addr.h \
    ./usr/include/linux/if_addrlabel.h \
    ./usr/include/linux/if_alg.h \
    ./usr/include/linux/if_arcnet.h \
    ./usr/include/linux/if_arp.h \
    ./usr/include/linux/if_bonding.h \
    ./usr/include/linux/if_bridge.h \
    ./usr/include/linux/if_cablemodem.h \
    ./usr/include/linux/if_eql.h \
    ./usr/include/linux/if_ether.h \
    ./usr/include/linux/if_fc.h \
    ./usr/include/linux/if_fddi.h \
    ./usr/include/linux/if_frad.h \
    ./usr/include/linux/if_hippi.h \
    ./usr/include/linux/if_infiniband.h \
    ./usr/include/linux/if_link.h \
    ./usr/include/linux/if_ltalk.h \
    ./usr/include/linux/if_packet.h \
    ./usr/include/linux/if_phonet.h \
    ./usr/include/linux/if_plip.h \
    ./usr/include/linux/if_ppp.h \
    ./usr/include/linux/if_pppol2tp.h \
    ./usr/include/linux/if_pppox.h \
    ./usr/include/linux/if_slip.h \
    ./usr/include/linux/if_team.h \
    ./usr/include/linux/if_tun.h \
    ./usr/include/linux/if_tunnel.h \
    ./usr/include/linux/if_vlan.h \
    ./usr/include/linux/if_x25.h \
    ./usr/include/linux/igmp.h \
    ./usr/include/linux/in.h \
    ./usr/include/linux/in6.h \
    ./usr/include/linux/in_route.h \
    ./usr/include/linux/inet_diag.h \
    ./usr/include/linux/inotify.h \
    ./usr/include/linux/input.h \
    ./usr/include/linux/ioctl.h \
    ./usr/include/linux/ip.h \
    ./usr/include/linux/ip6_tunnel.h \
    ./usr/include/linux/ip_vs.h \
    ./usr/include/linux/ipc.h \
    ./usr/include/linux/ipmi.h \
    ./usr/include/linux/ipmi_msgdefs.h \
    ./usr/include/linux/ipsec.h \
    ./usr/include/linux/ipv6.h \
    ./usr/include/linux/ipv6_route.h \
    ./usr/include/linux/ipx.h \
    ./usr/include/linux/irda.h \
    ./usr/include/linux/irqnr.h \
    ./usr/include/linux/isdn.h \
    ./usr/include/linux/isdn/capicmd.h \
    ./usr/include/linux/isdn_divertif.h \
    ./usr/include/linux/isdn_ppp.h \
    ./usr/include/linux/isdnif.h \
    ./usr/include/linux/iso_fs.h \
    ./usr/include/linux/ivtv.h \
    ./usr/include/linux/ivtvfb.h \
    ./usr/include/linux/ixjuser.h \
    ./usr/include/linux/jffs2.h \
    ./usr/include/linux/joystick.h \
    ./usr/include/linux/kd.h \
    ./usr/include/linux/kdev_t.h \
    ./usr/include/linux/kernel-page-flags.h \
    ./usr/include/linux/kernel.h \
    ./usr/include/linux/kernelcapi.h \
    ./usr/include/linux/kexec.h \
    ./usr/include/linux/keyboard.h \
    ./usr/include/linux/keyctl.h \
    ./usr/include/linux/kvm.h \
    ./usr/include/linux/kvm_para.h \
    ./usr/include/linux/l2tp.h \
    ./usr/include/linux/libc-compat.h \
    ./usr/include/linux/limits.h \
    ./usr/include/linux/llc.h \
    ./usr/include/linux/loop.h \
    ./usr/include/linux/lp.h \
    ./usr/include/linux/magic.h \
    ./usr/include/linux/major.h \
    ./usr/include/linux/map_to_7segment.h \
    ./usr/include/linux/matroxfb.h \
    ./usr/include/linux/mdio.h \
    ./usr/include/linux/media.h \
    ./usr/include/linux/mei.h \
    ./usr/include/linux/memfd.h \
    ./usr/include/linux/mempolicy.h \
    ./usr/include/linux/meye.h \
    ./usr/include/linux/mic_common.h \
    ./usr/include/linux/mic_ioctl.h \
    ./usr/include/linux/mii.h \
    ./usr/include/linux/minix_fs.h \
    ./usr/include/linux/mman.h \
    ./usr/include/linux/mmc/ioctl.h \
    ./usr/include/linux/mmtimer.h \
    ./usr/include/linux/mqueue.h \
    ./usr/include/linux/mroute.h \
    ./usr/include/linux/mroute6.h \
    ./usr/include/linux/msdos_fs.h \
    ./usr/include/linux/msg.h \
    ./usr/include/linux/mtio.h \
    ./usr/include/linux/n_r3964.h \
    ./usr/include/linux/nbd.h \
    ./usr/include/linux/ncp.h \
    ./usr/include/linux/ncp_fs.h \
    ./usr/include/linux/ncp_mount.h \
    ./usr/include/linux/ncp_no.h \
    ./usr/include/linux/neighbour.h \
    ./usr/include/linux/net.h \
    ./usr/include/linux/net_dropmon.h \
    ./usr/include/linux/net_tstamp.h \
    ./usr/include/linux/netconf.h \
    ./usr/include/linux/netdevice.h \
    ./usr/include/linux/netfilter.h \
    ./usr/include/linux/netfilter/ipset/ip_set.h \
    ./usr/include/linux/netfilter/ipset/ip_set_bitmap.h \
    ./usr/include/linux/netfilter/ipset/ip_set_hash.h \
    ./usr/include/linux/netfilter/ipset/ip_set_list.h \
    ./usr/include/linux/netfilter/nf_conntrack_common.h \
    ./usr/include/linux/netfilter/nf_conntrack_ftp.h \
    ./usr/include/linux/netfilter/nf_conntrack_sctp.h \
    ./usr/include/linux/netfilter/nf_conntrack_tcp.h \
    ./usr/include/linux/netfilter/nf_conntrack_tuple_common.h \
    ./usr/include/linux/netfilter/nf_nat.h \
    ./usr/include/linux/netfilter/nf_tables.h \
    ./usr/include/linux/netfilter/nf_tables_compat.h \
    ./usr/include/linux/netfilter/nfnetlink.h \
    ./usr/include/linux/netfilter/nfnetlink_acct.h \
    ./usr/include/linux/netfilter/nfnetlink_compat.h \
    ./usr/include/linux/netfilter/nfnetlink_conntrack.h \
    ./usr/include/linux/netfilter/nfnetlink_cthelper.h \
    ./usr/include/linux/netfilter/nfnetlink_cttimeout.h \
    ./usr/include/linux/netfilter/nfnetlink_log.h \
    ./usr/include/linux/netfilter/nfnetlink_queue.h \
    ./usr/include/linux/netfilter/x_tables.h \
    ./usr/include/linux/netfilter/xt_AUDIT.h \
    ./usr/include/linux/netfilter/xt_CHECKSUM.h \
    ./usr/include/linux/netfilter/xt_CLASSIFY.h \
    ./usr/include/linux/netfilter/xt_CONNMARK.h \
    ./usr/include/linux/netfilter/xt_CONNSECMARK.h \
    ./usr/include/linux/netfilter/xt_CT.h \
    ./usr/include/linux/netfilter/xt_DSCP.h \
    ./usr/include/linux/netfilter/xt_HMARK.h \
    ./usr/include/linux/netfilter/xt_IDLETIMER.h \
    ./usr/include/linux/netfilter/xt_LED.h \
    ./usr/include/linux/netfilter/xt_LOG.h \
    ./usr/include/linux/netfilter/xt_MARK.h \
    ./usr/include/linux/netfilter/xt_NFLOG.h \
    ./usr/include/linux/netfilter/xt_NFQUEUE.h \
    ./usr/include/linux/netfilter/xt_RATEEST.h \
    ./usr/include/linux/netfilter/xt_SECMARK.h \
    ./usr/include/linux/netfilter/xt_TCPMSS.h \
    ./usr/include/linux/netfilter/xt_TCPOPTSTRIP.h \
    ./usr/include/linux/netfilter/xt_TEE.h \
    ./usr/include/linux/netfilter/xt_TPROXY.h \
    ./usr/include/linux/netfilter/xt_addrtype.h \
    ./usr/include/linux/netfilter/xt_bpf.h \
    ./usr/include/linux/netfilter/xt_cgroup.h \
    ./usr/include/linux/netfilter/xt_cluster.h \
    ./usr/include/linux/netfilter/xt_comment.h \
    ./usr/include/linux/netfilter/xt_connbytes.h \
    ./usr/include/linux/netfilter/xt_connlabel.h \
    ./usr/include/linux/netfilter/xt_connlimit.h \
    ./usr/include/linux/netfilter/xt_connmark.h \
    ./usr/include/linux/netfilter/xt_conntrack.h \
    ./usr/include/linux/netfilter/xt_cpu.h \
    ./usr/include/linux/netfilter/xt_dccp.h \
    ./usr/include/linux/netfilter/xt_devgroup.h \
    ./usr/include/linux/netfilter/xt_dscp.h \
    ./usr/include/linux/netfilter/xt_ecn.h \
    ./usr/include/linux/netfilter/xt_esp.h \
    ./usr/include/linux/netfilter/xt_hashlimit.h \
    ./usr/include/linux/netfilter/xt_helper.h \
    ./usr/include/linux/netfilter/xt_ipcomp.h \
    ./usr/include/linux/netfilter/xt_iprange.h \
    ./usr/include/linux/netfilter/xt_ipvs.h \
    ./usr/include/linux/netfilter/xt_l2tp.h \
    ./usr/include/linux/netfilter/xt_length.h \
    ./usr/include/linux/netfilter/xt_limit.h \
    ./usr/include/linux/netfilter/xt_mac.h \
    ./usr/include/linux/netfilter/xt_mark.h \
    ./usr/include/linux/netfilter/xt_multiport.h \
    ./usr/include/linux/netfilter/xt_nfacct.h \
    ./usr/include/linux/netfilter/xt_osf.h \
    ./usr/include/linux/netfilter/xt_owner.h \
    ./usr/include/linux/netfilter/xt_physdev.h \
    ./usr/include/linux/netfilter/xt_pkttype.h \
    ./usr/include/linux/netfilter/xt_policy.h \
    ./usr/include/linux/netfilter/xt_quota.h \
    ./usr/include/linux/netfilter/xt_rateest.h \
    ./usr/include/linux/netfilter/xt_realm.h \
    ./usr/include/linux/netfilter/xt_recent.h \
    ./usr/include/linux/netfilter/xt_rpfilter.h \
    ./usr/include/linux/netfilter/xt_sctp.h \
    ./usr/include/linux/netfilter/xt_set.h \
    ./usr/include/linux/netfilter/xt_socket.h \
    ./usr/include/linux/netfilter/xt_state.h \
    ./usr/include/linux/netfilter/xt_statistic.h \
    ./usr/include/linux/netfilter/xt_string.h \
    ./usr/include/linux/netfilter/xt_tcpmss.h \
    ./usr/include/linux/netfilter/xt_tcpudp.h \
    ./usr/include/linux/netfilter/xt_time.h \
    ./usr/include/linux/netfilter/xt_u32.h \
    ./usr/include/linux/netfilter_arp.h \
    ./usr/include/linux/netfilter_arp/arp_tables.h \
    ./usr/include/linux/netfilter_arp/arpt_mangle.h \
    ./usr/include/linux/netfilter_bridge.h \
    ./usr/include/linux/netfilter_bridge/ebt_802_3.h \
    ./usr/include/linux/netfilter_bridge/ebt_among.h \
    ./usr/include/linux/netfilter_bridge/ebt_arp.h \
    ./usr/include/linux/netfilter_bridge/ebt_arpreply.h \
    ./usr/include/linux/netfilter_bridge/ebt_ip.h \
    ./usr/include/linux/netfilter_bridge/ebt_ip6.h \
    ./usr/include/linux/netfilter_bridge/ebt_limit.h \
    ./usr/include/linux/netfilter_bridge/ebt_log.h \
    ./usr/include/linux/netfilter_bridge/ebt_mark_m.h \
    ./usr/include/linux/netfilter_bridge/ebt_mark_t.h \
    ./usr/include/linux/netfilter_bridge/ebt_nat.h \
    ./usr/include/linux/netfilter_bridge/ebt_nflog.h \
    ./usr/include/linux/netfilter_bridge/ebt_pkttype.h \
    ./usr/include/linux/netfilter_bridge/ebt_redirect.h \
    ./usr/include/linux/netfilter_bridge/ebt_stp.h \
    ./usr/include/linux/netfilter_bridge/ebt_ulog.h \
    ./usr/include/linux/netfilter_bridge/ebt_vlan.h \
    ./usr/include/linux/netfilter_bridge/ebtables.h \
    ./usr/include/linux/netfilter_decnet.h \
    ./usr/include/linux/netfilter_ipv4.h \
    ./usr/include/linux/netfilter_ipv4/ip_tables.h \
    ./usr/include/linux/netfilter_ipv4/ipt_CLUSTERIP.h \
    ./usr/include/linux/netfilter_ipv4/ipt_ECN.h \
    ./usr/include/linux/netfilter_ipv4/ipt_LOG.h \
    ./usr/include/linux/netfilter_ipv4/ipt_REJECT.h \
    ./usr/include/linux/netfilter_ipv4/ipt_TTL.h \
    ./usr/include/linux/netfilter_ipv4/ipt_ULOG.h \
    ./usr/include/linux/netfilter_ipv4/ipt_ah.h \
    ./usr/include/linux/netfilter_ipv4/ipt_ecn.h \
    ./usr/include/linux/netfilter_ipv4/ipt_ttl.h \
    ./usr/include/linux/netfilter_ipv6.h \
    ./usr/include/linux/netfilter_ipv6/ip6_tables.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_HL.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_LOG.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_NPT.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_REJECT.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_ah.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_frag.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_hl.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_ipv6header.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_mh.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_opts.h \
    ./usr/include/linux/netfilter_ipv6/ip6t_rt.h \
    ./usr/include/linux/netlink.h \
    ./usr/include/linux/netlink_diag.h \
    ./usr/include/linux/netrom.h \
    ./usr/include/linux/nfc.h \
    ./usr/include/linux/nfs.h \
    ./usr/include/linux/nfs2.h \
    ./usr/include/linux/nfs3.h \
    ./usr/include/linux/nfs4.h \
    ./usr/include/linux/nfs4_mount.h \
    ./usr/include/linux/nfs_fs.h \
    ./usr/include/linux/nfs_idmap.h \
    ./usr/include/linux/nfs_mount.h \
    ./usr/include/linux/nfsacl.h \
    ./usr/include/linux/nfsd/cld.h \
    ./usr/include/linux/nfsd/debug.h \
    ./usr/include/linux/nfsd/export.h \
    ./usr/include/linux/nfsd/nfsfh.h \
    ./usr/include/linux/nfsd/stats.h \
    ./usr/include/linux/nl80211.h \
    ./usr/include/linux/nubus.h \
    ./usr/include/linux/nvme.h \
    ./usr/include/linux/nvram.h \
    ./usr/include/linux/omap3isp.h \
    ./usr/include/linux/omapfb.h \
    ./usr/include/linux/oom.h \
    ./usr/include/linux/openvswitch.h \
    ./usr/include/linux/packet_diag.h \
    ./usr/include/linux/param.h \
    ./usr/include/linux/parport.h \
    ./usr/include/linux/patchkey.h \
    ./usr/include/linux/pci.h \
    ./usr/include/linux/pci_regs.h \
    ./usr/include/linux/perf_event.h \
    ./usr/include/linux/personality.h \
    ./usr/include/linux/pfkeyv2.h \
    ./usr/include/linux/pg.h \
    ./usr/include/linux/phantom.h \
    ./usr/include/linux/phonet.h \
    ./usr/include/linux/pkt_cls.h \
    ./usr/include/linux/pkt_sched.h \
    ./usr/include/linux/pktcdvd.h \
    ./usr/include/linux/pmu.h \
    ./usr/include/linux/poll.h \
    ./usr/include/linux/posix_types.h \
    ./usr/include/linux/ppdev.h \
    ./usr/include/linux/ppp-comp.h \
    ./usr/include/linux/ppp-ioctl.h \
    ./usr/include/linux/ppp_defs.h \
    ./usr/include/linux/pps.h \
    ./usr/include/linux/prctl.h \
    ./usr/include/linux/psci.h \
    ./usr/include/linux/ptp_clock.h \
    ./usr/include/linux/ptrace.h \
    ./usr/include/linux/qnx4_fs.h \
    ./usr/include/linux/qnxtypes.h \
    ./usr/include/linux/quota.h \
    ./usr/include/linux/radeonfb.h \
    ./usr/include/linux/raid/md_p.h \
    ./usr/include/linux/raid/md_u.h \
    ./usr/include/linux/random.h \
    ./usr/include/linux/raw.h \
    ./usr/include/linux/rds.h \
    ./usr/include/linux/reboot.h \
    ./usr/include/linux/reiserfs_fs.h \
    ./usr/include/linux/reiserfs_xattr.h \
    ./usr/include/linux/resource.h \
    ./usr/include/linux/rfkill.h \
    ./usr/include/linux/romfs_fs.h \
    ./usr/include/linux/rose.h \
    ./usr/include/linux/route.h \
    ./usr/include/linux/rtc.h \
    ./usr/include/linux/rtnetlink.h \
    ./usr/include/linux/scc.h \
    ./usr/include/linux/sched.h \
    ./usr/include/linux/screen_info.h \
    ./usr/include/linux/sctp.h \
    ./usr/include/linux/sdla.h \
    ./usr/include/linux/seccomp.h \
    ./usr/include/linux/securebits.h \
    ./usr/include/linux/selinux_netlink.h \
    ./usr/include/linux/sem.h \
    ./usr/include/linux/serial.h \
    ./usr/include/linux/serial_core.h \
    ./usr/include/linux/serial_reg.h \
    ./usr/include/linux/serio.h \
    ./usr/include/linux/shm.h \
    ./usr/include/linux/signal.h \
    ./usr/include/linux/signalfd.h \
    ./usr/include/linux/snmp.h \
    ./usr/include/linux/sock_diag.h \
    ./usr/include/linux/socket.h \
    ./usr/include/linux/sockios.h \
    ./usr/include/linux/som.h \
    ./usr/include/linux/sonet.h \
    ./usr/include/linux/sonypi.h \
    ./usr/include/linux/sound.h \
    ./usr/include/linux/soundcard.h \
    ./usr/include/linux/spi/spidev.h \
    ./usr/include/linux/stat.h \
    ./usr/include/linux/stddef.h \
    ./usr/include/linux/string.h \
    ./usr/include/linux/sunrpc/debug.h \
    ./usr/include/linux/suspend_ioctls.h \
    ./usr/include/linux/swab.h \
    ./usr/include/linux/synclink.h \
    ./usr/include/linux/sysctl.h \
    ./usr/include/linux/sysinfo.h \
    ./usr/include/linux/taskstats.h \
    ./usr/include/linux/tc_act/tc_csum.h \
    ./usr/include/linux/tc_act/tc_defact.h \
    ./usr/include/linux/tc_act/tc_gact.h \
    ./usr/include/linux/tc_act/tc_ipt.h \
    ./usr/include/linux/tc_act/tc_mirred.h \
    ./usr/include/linux/tc_act/tc_nat.h \
    ./usr/include/linux/tc_act/tc_pedit.h \
    ./usr/include/linux/tc_act/tc_skbedit.h \
    ./usr/include/linux/tc_ematch/tc_em_cmp.h \
    ./usr/include/linux/tc_ematch/tc_em_meta.h \
    ./usr/include/linux/tc_ematch/tc_em_nbyte.h \
    ./usr/include/linux/tc_ematch/tc_em_text.h \
    ./usr/include/linux/tcp.h \
    ./usr/include/linux/tcp_metrics.h \
    ./usr/include/linux/telephony.h \
    ./usr/include/linux/termios.h \
    ./usr/include/linux/time.h \
    ./usr/include/linux/times.h \
    ./usr/include/linux/timex.h \
    ./usr/include/linux/tiocl.h \
    ./usr/include/linux/tipc.h \
    ./usr/include/linux/tipc_config.h \
    ./usr/include/linux/toshiba.h \
    ./usr/include/linux/tty.h \
    ./usr/include/linux/tty_flags.h \
    ./usr/include/linux/types.h \
    ./usr/include/linux/udf_fs_i.h \
    ./usr/include/linux/udp.h \
    ./usr/include/linux/uhid.h \
    ./usr/include/linux/uinput.h \
    ./usr/include/linux/uio.h \
    ./usr/include/linux/ultrasound.h \
    ./usr/include/linux/un.h \
    ./usr/include/linux/unistd.h \
    ./usr/include/linux/unix_diag.h \
    ./usr/include/linux/usb/audio.h \
    ./usr/include/linux/usb/cdc-wdm.h \
    ./usr/include/linux/usb/cdc.h \
    ./usr/include/linux/usb/ch11.h \
    ./usr/include/linux/usb/ch9.h \
    ./usr/include/linux/usb/functionfs.h \
    ./usr/include/linux/usb/g_printer.h \
    ./usr/include/linux/usb/gadgetfs.h \
    ./usr/include/linux/usb/midi.h \
    ./usr/include/linux/usb/tmc.h \
    ./usr/include/linux/usb/video.h \
    ./usr/include/linux/usbdevice_fs.h \
    ./usr/include/linux/utime.h \
    ./usr/include/linux/utsname.h \
    ./usr/include/linux/uuid.h \
    ./usr/include/linux/uvcvideo.h \
    ./usr/include/linux/v4l2-common.h \
    ./usr/include/linux/v4l2-controls.h \
    ./usr/include/linux/v4l2-dv-timings.h \
    ./usr/include/linux/v4l2-mediabus.h \
    ./usr/include/linux/v4l2-subdev.h \
    ./usr/include/linux/version.h \
    ./usr/include/linux/veth.h \
    ./usr/include/linux/vfio.h \
    ./usr/include/linux/vhost.h \
    ./usr/include/linux/videodev2.h \
    ./usr/include/linux/virtio_9p.h \
    ./usr/include/linux/virtio_balloon.h \
    ./usr/include/linux/virtio_blk.h \
    ./usr/include/linux/virtio_config.h \
    ./usr/include/linux/virtio_console.h \
    ./usr/include/linux/virtio_ids.h \
    ./usr/include/linux/virtio_net.h \
    ./usr/include/linux/virtio_pci.h \
    ./usr/include/linux/virtio_ring.h \
    ./usr/include/linux/virtio_rng.h \
    ./usr/include/linux/vt.h \
    ./usr/include/linux/wait.h \
    ./usr/include/linux/wanrouter.h \
    ./usr/include/linux/watchdog.h \
    ./usr/include/linux/wimax.h \
    ./usr/include/linux/wimax/i2400m.h \
    ./usr/include/linux/wireless.h \
    ./usr/include/linux/x25.h \
    ./usr/include/linux/xattr.h \
    ./usr/include/linux/xfrm.h \
    ./usr/include/linux/zorro.h \
    ./usr/include/linux/zorro_ids.h \
    ./usr/include/mtd/inftl-user.h \
    ./usr/include/mtd/mtd-abi.h \
    ./usr/include/mtd/mtd-user.h \
    ./usr/include/mtd/nftl-user.h \
    ./usr/include/mtd/ubi-user.h \
    ./usr/include/rdma/ib_user_cm.h \
    ./usr/include/rdma/ib_user_mad.h \
    ./usr/include/rdma/ib_user_sa.h \
    ./usr/include/rdma/ib_user_verbs.h \
    ./usr/include/rdma/rdma_netlink.h \
    ./usr/include/rdma/rdma_user_cm.h \
    ./usr/include/sound/asequencer.h \
    ./usr/include/sound/asound.h \
    ./usr/include/sound/asound_fm.h \
    ./usr/include/sound/compress_offload.h \
    ./usr/include/sound/compress_params.h \
    ./usr/include/sound/emu10k1.h \
    ./usr/include/sound/firewire.h \
    ./usr/include/sound/hdsp.h \
    ./usr/include/sound/hdspm.h \
    ./usr/include/sound/sb16_csp.h \
    ./usr/include/sound/sfnt_info.h \
    ./usr/include/video/edid.h \
    ./usr/include/video/sisfb.h \
    ./usr/include/video/uvesafb.h \
    ./usr/include/xen/evtchn.h \
    ./usr/include/xen/gntalloc.h \
    ./usr/include/xen/gntdev.h \
    ./usr/include/xen/privcmd.h \
    ./usr/share/doc/linux-libc-dev/changelog.Debian.gz \
    ./usr/share/doc/linux-libc-dev/copyright\
"
